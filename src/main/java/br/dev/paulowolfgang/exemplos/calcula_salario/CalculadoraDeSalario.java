package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public class CalculadoraDeSalario
{
    public double calculaSalario(Funcionario funcionario)
    {
        return funcionario.getCargo().getRegra().calcula(funcionario);
    }
}
