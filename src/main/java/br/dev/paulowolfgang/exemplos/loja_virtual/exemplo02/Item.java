package br.dev.paulowolfgang.exemplos.loja_virtual.exemplo02;

/**
 *
 * @author Paulo Silva
 */
public class Item {
    
    private String descricao;
    private int quantidade;
    private double valorUnitario;
    
    public Item(String descricao, int quantidade, double valorUnitario)
    {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }
    
    public double getValorTotal()
    {
        return this.valorUnitario * this.quantidade;
    }
}
