package br.dev.paulowolfgang.exemplos.processador_boleto;

import java.util.List;

/**
 *
 * @author Paulo Silva
 */
public class ProcessadorDeBoletos {
    
    public void processa(List<Boleto> boletos, Fatura fatura)
    {
        for(Boleto boleto: boletos)
        {
            Pagamento pagamento = new Pagamento(boleto.getValor(), FormaDePagamento.BOLETO);
            fatura.getPagamentos().add(pagamento);
        }
    }
}
