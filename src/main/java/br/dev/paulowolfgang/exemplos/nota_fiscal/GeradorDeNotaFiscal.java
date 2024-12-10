package br.dev.paulowolfgang.exemplos.nota_fiscal;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Paulo Silva
 */
public class GeradorDeNotaFiscal {
    
    private final List<AcaoAposGerarNota> acoes;
    private final Relogio relogio;
    private final Tabela tabela;
    
    public GeradorDeNotaFiscal(
            List<AcaoAposGerarNota> acoes,
            Relogio relogio,
            Tabela tabela)
    {
        this.acoes = acoes;
        this.relogio = relogio;
        this.tabela = tabela;
    }
    
    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes)
    {
        this(acoes, new RelogioDoSistema(), new TabelaDeImpostos());
    }
    
    public NotaFiscal gera(Pedido pedido)
    {
        NotaFiscal notaFiscal = new NotaFiscal(
                pedido.getCliente(),
                pedido.getValorTotal() * tabela.paraValor(pedido.getValorTotal()),
                relogio.hoje()
        );
        
        for(AcaoAposGerarNota acao: acoes)
        {
            acao.executa(notaFiscal);
        }
        
        return notaFiscal;
    }
}
