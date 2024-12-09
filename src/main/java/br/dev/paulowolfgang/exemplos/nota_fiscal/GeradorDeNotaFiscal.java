package br.dev.paulowolfgang.exemplos.nota_fiscal;

import java.util.Calendar;

/**
 *
 * @author Paulo Silva
 */
public class GeradorDeNotaFiscal {
    
    private NfDao dao;
    
    public GeradorDeNotaFiscal(NfDao dao)
    {
        this.dao = dao;
    }
    
    public NotaFiscal gera(Pedido pedido)
    {
        NotaFiscal notaFiscal = new NotaFiscal(
                pedido.getCliente(),
                pedido.getValorTotal() * 0.94,
                Calendar.getInstance()
        );
        
        dao.persiste(notaFiscal);
        
        return notaFiscal;
    }
}
