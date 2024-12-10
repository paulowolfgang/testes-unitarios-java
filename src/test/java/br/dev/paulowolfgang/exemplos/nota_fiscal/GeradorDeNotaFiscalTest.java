package br.dev.paulowolfgang.exemplos.nota_fiscal;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

/**
 *
 * @author Paulo SIlva
 */
public class GeradorDeNotaFiscalTest {
    
    private NfDao dao;
    private Sap sap;
    private Relogio relogio;
    private Tabela tabela;
    private List<AcaoAposGerarNota> acoes;
    private GeradorDeNotaFiscal gerador;

    @BeforeEach
    public void inicializa() {
        // Inicializar os mocks
        dao = Mockito.mock(NfDao.class);
        sap = Mockito.mock(Sap.class);
        relogio = Mockito.mock(Relogio.class);
        tabela = Mockito.mock(Tabela.class);

        // Configurar comportamento padrão dos mocks
        Mockito.when(relogio.hoje()).thenReturn(Calendar.getInstance());
        Mockito.when(tabela.paraValor(Mockito.anyDouble())).thenReturn(0.94);

        // Adicionar os mocks na lista de ações
        acoes = new ArrayList<>();
        acoes.add(dao);
        acoes.add(sap);

        // Criar o Gerador de Nota Fiscal com os mocks
        gerador = new GeradorDeNotaFiscal(acoes, relogio, tabela);
    }

    @Test
    public void deveGerarNfComValorDeImpostoDescontado() {
        Pedido pedido = new Pedido("Ana", 1000, 1);
        NotaFiscal notaFiscal = gerador.gera(pedido);

        Assertions.assertEquals(1000 * 0.94, notaFiscal.getValor());
    }
    
    @Test
    public void devePersistirEEnviarNfGerada() {
        Pedido pedido = new Pedido("Maurício", 1000, 1);
        NotaFiscal notaFiscal = gerador.gera(pedido);

        // Verificar interações com NfDao e Sap
        Mockito.verify(dao).executa(notaFiscal);
        Mockito.verify(sap).executa(notaFiscal);
    }

    @Test
    public void deveInvocarAcoesPosteriores() {
        AcaoAposGerarNota acao01 = Mockito.mock(AcaoAposGerarNota.class);
        AcaoAposGerarNota acao02 = Mockito.mock(AcaoAposGerarNota.class);

        // Criar um novo gerador com ações personalizadas
        List<AcaoAposGerarNota> acoesCustomizadas = List.of(acao01, acao02);
        GeradorDeNotaFiscal geradorPersonalizado = new GeradorDeNotaFiscal(
                acoesCustomizadas,
                relogio,
                tabela);

        Pedido pedido = new Pedido("Pedro", 1000, 1);
        NotaFiscal notaFiscal = geradorPersonalizado.gera(pedido);

        Mockito.verify(acao01).executa(notaFiscal);
        Mockito.verify(acao02).executa(notaFiscal);
    }
    
    @Test
    public void deveConsultarATabelaParaCalcularValor() {
        Pedido pedido = new Pedido("Roberto", 1000, 1);

        // Configurar o mock da tabela para retornar um valor específico
        Mockito.when(tabela.paraValor(1000.0)).thenReturn(0.2);

        NotaFiscal notaFiscal = gerador.gera(pedido);

        // Verificar que o método foi chamado corretamente
        Mockito.verify(tabela).paraValor(1000.0);
        Assertions.assertEquals(1000 * 0.2, notaFiscal.getValor());
    }
}
