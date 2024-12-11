package br.dev.paulowolfgang.exemplos.processador_boleto;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Paulo Silva
 */
public class ProcessadorDeBoletosTest {
    
    @Test
    public void deveProcessarPagamentoViaBoletoUnico()
    {
        ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
        Fatura fatura = new Fatura("Ana", 150.0);
        Boleto boleto01 = new Boleto(150.0);
        
        List<Boleto> boletos = Arrays.asList(boleto01);
        
        processador.processa(boletos, fatura);
        
        Assertions.assertEquals(1, fatura.getPagamentos().size());
        Assertions.assertEquals(150.0, fatura.getPagamentos().get(0).getValor());
    }
    
    @Test
    public void deveProcessarPagamentoViaMuitosBoletos()
    {
        ProcessadorDeBoletos processador = new ProcessadorDeBoletos();
        
        Fatura fatura = new Fatura("Gisele", 300.0);
        Boleto boleto01 = new Boleto(100.0);
        Boleto boleto02 = new Boleto(200.0);
        List<Boleto> boletos = Arrays.asList(boleto01, boleto02);
        
        processador.processa(boletos, fatura);
        
        Assertions.assertEquals(2, fatura.getPagamentos().size());
        Assertions.assertEquals(100.0, fatura.getPagamentos().get(0).getValor());
        Assertions.assertEquals(200.0, fatura.getPagamentos().get(1).getValor());
    }
}
