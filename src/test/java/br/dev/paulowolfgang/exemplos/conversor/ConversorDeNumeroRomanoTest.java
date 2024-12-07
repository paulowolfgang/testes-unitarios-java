package br.dev.paulowolfgang.exemplos.conversor;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Paulo Silva
 */
public class ConversorDeNumeroRomanoTest {
    
    private ConversorDeNumeroRomano romano;
    
    @BeforeEach
    public void inicializa()
    {
        this.romano = new ConversorDeNumeroRomano();
    }
    
    @Test
    public void deveEntenderOSimboloI()
    {
        int numero = romano.converte("I");
        Assertions.assertEquals(1, numero);
    }
    
    @Test
    public void deveEntenderOSimboloV()
    {
        int numero = romano.converte("V");
        Assertions.assertEquals(5, numero);
    }
    
    @Test
    public void deveEntenderOSimboloX()
    {
        int numero = romano.converte("X");
        Assertions.assertEquals(10, numero);
    }
    
    @Test
    public void deveEntenderDoisSimbolosComoII()
    {
        int numero = romano.converte("II");
        Assertions.assertEquals(2, numero);
    }
    
    @Test
    public void deveEntenderQuatroSimbolosDoisADoisComoXXII()
    {
        int numero = romano.converte("XXII");
        Assertions.assertEquals(22, numero);
    }
    
    @Test
    public void deveEntenderNumerosComoIX()
    {
        int numero = romano.converte("IX");
        Assertions.assertEquals(9, numero);
    }
    
    @Test
    public void deveEntenderNumerosComplexosComoXXIV()
    {
        int numero = romano.converte("XXIV");
        Assertions.assertEquals(24, numero);
    }
}
