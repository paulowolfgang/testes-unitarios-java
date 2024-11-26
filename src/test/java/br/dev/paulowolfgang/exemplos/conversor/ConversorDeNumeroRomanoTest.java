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
    
    @Test
    public void deveEntenderOSimboloV()
    {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("V");
        Assertions.assertEquals(5, numero);
    }
    
    @Test
    public void deveEntenderOSimboloX()
    {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("X");
        Assertions.assertEquals(10, numero);
    }
    
    @Test
    public void deveEntenderDoisSimbolosComoII()
    {
        ConversorDeNumeroRomano romano = new ConversorDeNumeroRomano();
        int numero = romano.converte("II");
        Assertions.assertEquals(2, numero);
    }
}
