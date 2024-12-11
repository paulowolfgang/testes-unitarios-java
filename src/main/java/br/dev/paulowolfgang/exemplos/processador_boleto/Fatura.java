package br.dev.paulowolfgang.exemplos.processador_boleto;

import java.util.ArrayList;

/**
 *
 * @author Paulo Silva
 */
public class Fatura {
    
    private String nome;
    private double valor;
    private ArrayList<Pagamento> pagamentos;
    
    public Fatura(String nome, double valor)
    {
        this.nome = nome;
        this.valor = valor;
        this.pagamentos = new ArrayList<>();
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
}
