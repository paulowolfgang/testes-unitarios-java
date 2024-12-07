package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public abstract class RegraDeCalculo {
    
    public double calcula(Funcionario funcionario)
    {
        if(funcionario.getSalario() > limite())
        {
            return funcionario.getSalario() * porcentagemAcimaDoLimite();
        }
        return funcionario.getSalario() * porcentagemBase();
    }
    
    protected abstract double limite();
    protected abstract double porcentagemBase();
    protected abstract double porcentagemAcimaDoLimite();
}
