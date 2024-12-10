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
    
    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes, Relogio relogio)
    {
        this.acoes = acoes;
        this.relogio = relogio;
    }
    
    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes)
    {
        this(acoes, new RelogioDoSistema());
    }
    
    public NotaFiscal gera(Pedido pedido)
    {
        NotaFiscal notaFiscal = new NotaFiscal(
                pedido.getCliente(),
                pedido.getValorTotal() * 0.94,
                relogio.hoje()
        );
        
        for(AcaoAposGerarNota acao: acoes)
        {
            acao.executa(notaFiscal);
        }
        
        return notaFiscal;
    }
}
