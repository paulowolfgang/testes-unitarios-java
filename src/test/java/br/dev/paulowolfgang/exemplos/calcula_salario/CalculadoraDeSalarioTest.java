package br.dev.paulowolfgang.exemplos.calcula_salario;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

/**
 *
 * @author Paulo Silva
 */
public class CalculadoraDeSalarioTest {
    
    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAbaixoDoLimite()
    {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario desenvolvedor = new Funcionario("Daniel", 1500.0, Cargo.DESENVOLVEDOR);
        
        double salario = calculadora.calculaSalario(desenvolvedor);
        Assertions.assertEquals(1500.0 * 0.9, salario);
    }
}
