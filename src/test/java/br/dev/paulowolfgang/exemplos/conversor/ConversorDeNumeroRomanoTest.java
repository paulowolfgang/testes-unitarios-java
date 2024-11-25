package br.dev.paulowolfgang.exemplos.conversor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Paulo Silva
 */
public class ConversorDeNumeroRomanoTest {
    
    @Test
    public void deveEntenderOSimboloI()
    {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("I");
        Assertions.assertEquals(1, numero);
    }
}
