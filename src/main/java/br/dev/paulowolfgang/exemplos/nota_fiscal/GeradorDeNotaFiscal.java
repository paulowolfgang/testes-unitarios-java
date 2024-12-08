package br.dev.paulowolfgang.exemplos.nota_fiscal;

import java.util.Calendar;

/**
 *
 * @author Paulo Silva
 */
public class GeradorDeNotaFiscal {
    
    public NotaFiscal gera(Pedido pedido)
    {
        return new NotaFiscal(
                pedido.getCliente(),
                pedido.getValorTotal() * 0.94,
                Calendar.getInstance()
        );
    }
}
