package br.dev.paulowolfgang.exemplos.nota_fiscal;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Paulo SIlva
 */
public class GeradorDeNotaFiscalTest {
    
    private GeradorDeNotalFiscal gerador;
    
    @BeforeEach
    public void inicializa()
    {
        this.gerador = new GeradorDeNotaFiscal();
    }
    
    @Test
    public void deveGerarNfComValorDeImpostoDescontado()
    {
        Pedido pedido = new Pedido("Ana", 1000, 1);
        NotaFiscal notaFiscal = gerador.gera(pedido);
        Assertions.assertEquals(1000 * 0.94, notaFiscal.getValor());
    }
}
