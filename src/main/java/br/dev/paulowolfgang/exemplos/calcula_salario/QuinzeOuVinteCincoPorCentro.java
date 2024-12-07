package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public class QuinzeOuVinteCincoPorCentro implements RegraDeCalculo {
    
    private static final double LIMITE_SALARIO = 2500;
    private static final double VALOR_DESCONTO_ABAIXO_LIMITE = 0.85;
    private static final double VALOR_DESCONTO_ACIMA_LIMITE = 0.75;

    @Override
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalario() > LIMITE_SALARIO)
        {
            return funcionario.getSalario() * VALOR_DESCONTO_ACIMA_LIMITE;
        }
        return funcionario.getSalario() * VALOR_DESCONTO_ABAIXO_LIMITE;
    }
}
