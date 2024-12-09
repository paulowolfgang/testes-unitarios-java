package br.dev.paulowolfgang.exemplos.nota_fiscal;

import java.util.Calendar;

/**
 *
 * @author Paulo Silva
 */
public class GeradorDeNotaFiscal {
    
    private NfDao dao;
    private final Sap sap;
    
    public GeradorDeNotaFiscal(NfDao dao, Sap sap)
    {
        this.dao = dao;
        this.sap = sap;
    }
    
    public NotaFiscal gera(Pedido pedido)
    {
        NotaFiscal notaFiscal = new NotaFiscal(
                pedido.getCliente(),
                pedido.getValorTotal() * 0.94,
                Calendar.getInstance()
        );
        
        dao.persiste(notaFiscal);
        sap.envia(notaFiscal);
        
        return notaFiscal;
    }
}
