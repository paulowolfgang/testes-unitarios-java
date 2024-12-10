package br.dev.paulowolfgang.exemplos.nota_fiscal;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author Paulo Silva
 */
public class GeradorDeNotaFiscal {
    
    private final List<AcaoAposGerarNota> acoes;
    
    public GeradorDeNotaFiscal(List<AcaoAposGerarNota> acoes)
    {
        this.acoes = acoes;
    }
    
    public NotaFiscal gera(Pedido pedido)
    {
        NotaFiscal notaFiscal = new NotaFiscal(
                pedido.getCliente(),
                pedido.getValorTotal() * 0.94,
                Calendar.getInstance()
        );
        
        for(AcaoAposGerarNota acao: acoes)
        {
            acao.executa(notaFiscal);
        }
        
        return notaFiscal;
    }
}
