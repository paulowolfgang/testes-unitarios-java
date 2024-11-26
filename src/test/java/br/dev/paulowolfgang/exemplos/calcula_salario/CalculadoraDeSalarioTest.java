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
    
    @Test
    public void deveCalcularSalarioParaDesenvolvedoresComSalarioAcimaDoLimite()
    {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario desenvolvedor = new Funcionario("Paulo", 4000.0, Cargo.DESENVOLVEDOR);
        
        double salario = calculadora.calculaSalario(desenvolvedor);
        Assertions.assertEquals(4000.0 * 0.8, salario);
    }
    
    @Test
    public void deveCalcularSalarioParaDbasComSalarioAbaixoDoLimite()
    {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario dba = new Funcionario("José", 1000.0, Cargo.DBA);
        
        double salario = calculadora.calculaSalario(dba);
        Assertions.assertEquals(1000.0 * 0.85, salario);
    }
    
    @Test
    public void deveCalcularSalarioParaDbasComSalarioAcimaDoLimite()
    {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario dba = new Funcionario("Ana", 3000, Cargo.DBA);
        
        double salario = calculadora.calculaSalario(dba);
        Assertions.assertEquals(3000.0 * 0.75, salario);
    }
    
    @Test
    public void deveCalcularSalarioParaTestadoresComSalarioAbaixoDoLimite()
    {
        CalculadoraDeSalario calculadora = new CalculadoraDeSalario();
        Funcionario testador = new Funcionario("Lucia", 800.0, Cargo.TESTADOR);
        
        double salario = calculadora.calculaSalario(testador);
        Assertions.assertEquals(800.0 * 0.05, salario);
    }
}
