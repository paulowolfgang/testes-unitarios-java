package br.dev.paulowolfgang.exemplos.nota_fiscal;

import java.util.Calendar;

/**
 *
 * @author Paulo Silva
 */
public class NotaFiscal {
    
    private String cliente;
    private double valor;
    private Calendar data;
    
    public NotaFiscal(String cliente, double valor, Calendar data)
    {
        this.cliente = cliente;
        this.valor = valor;
        this.data = data;
    }
    
    public String getCliente()
    {
        return cliente;
    }
    
    public double getValor()
    {
        return valor;
    }
    
    public Calendar getData()
    {
        return data;
    }
}
