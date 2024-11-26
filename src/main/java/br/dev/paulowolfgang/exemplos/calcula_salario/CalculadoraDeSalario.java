package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public class CalculadoraDeSalario
{
    public double calculaSalario(Funcionario funcionario)
    {
        if(funcionario.getCargo().equals(Cargo.DESENVOLVEDOR))
        {
            if(funcionario.getSalario() > 3000)
            {
                return funcionario.getSalario() * 0.8;
            }
            
            return funcionario.getSalario() * 0.9;
        } else {
            if(funcionario.getSalario() > 2500)
            {
                return funcionario.getSalario() * 0.75;
            }
            return funcionario.getSalario() * 0.85;
        }
        
    }
}
