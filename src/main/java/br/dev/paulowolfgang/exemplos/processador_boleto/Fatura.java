package br.dev.paulowolfgang.exemplos.processador_boleto;

import java.util.ArrayList;

/**
 *
 * @author Paulo Silva
 */
public class Fatura {
    
    private String nome;
    private double valor;
    private boolean pago;
    private ArrayList<Pagamento> pagamentos;
    
    public Fatura(String nome, double valor)
    {
        this.nome = nome;
        this.valor = valor;
        this.pagamentos = new ArrayList<>();
        this.pago = pago;
    }
    
    public String getNome()
    {
        return nome;
    }
    
    public double getValor()
    {
        return valor;
    }
    
    public ArrayList<Pagamento> getPagamentos()
    {
        return pagamentos;
    }
    
    public void adicionarPagamento(Pagamento pagamento)
    {
        this.pagamentos.add(pagamento);
        
        double valorTotal = 0;
        for(Pagamento p : pagamentos)
        {
            valorTotal += p.getValor();
        }
        
        if(valorTotal >= this.valor)
        {
            this.pago = true;
        }
    }
    
    public boolean isPago()
    {
        return pago;
    }
}
