package br.dev.paulowolfgang.exemplos.processador_boleto;

/**
 *
 * @author Paulo Silva
 */
public class Pagamento {
    
    private double valor;
    private FormaDePagamento pagamento;
    
    public Pagamento(double valor, FormaDePagamento pagamento)
    {
        this.valor = valor;
        this.pagamento = pagamento;
    }
    
    public double getValor()
    {
        return valor;
    }
    
    public FormaDePagamento getPagamento()
    {
        return pagamento;
    }
}
