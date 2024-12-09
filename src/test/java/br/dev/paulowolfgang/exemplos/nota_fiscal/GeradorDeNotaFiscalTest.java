package br.dev.paulowolfgang.exemplos.nota_fiscal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;

/**
 *
 * @author Paulo SIlva
 */
public class GeradorDeNotaFiscalTest {
    
    @Test
    public void deveGerarNfComValorDeImpostoDescontado()
    {
        NfDao dao = Mockito.mock(NfDao.class);
        GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao);

        Pedido pedido = new Pedido("Ana", 1000, 1);
        NotaFiscal notaFiscal = gerador.gera(pedido);

        Assertions.assertEquals(1000 * 0.94, notaFiscal.getValor());
    }

    
    @Test
    public void devePersistirNfGerada()
    {
        NfDao dao = Mockito.mock(NfDao.class);
        GeradorDeNotaFiscal gerador = new GeradorDeNotaFiscal(dao);
        
        Pedido pedido = new Pedido("Maurício", 1000, 1);
        NotaFiscal notaFiscal = gerador.gera(pedido);
        
        Mockito.verify(dao).persiste(notaFiscal);
    }
    
    @Test
    public void deveEnviarNfGeradaParaSap()
    {
        NfDao dao = Mockito.mock(NfDao.class);
        Sap sap = Mockito.mock(Sap.class);
        
        GeradorDeNotaFiscal notaFiscal = new GeradorDeNotaFiscal(dao, sap);
        Pedido pedido = new Pedido("Roberto", 1000, 1);
        
        NotaFiscal notaFiscal = gerador.gera(pedido);
        
        Mockito.verify(sap).envia(notaFiscal);
    }
}
