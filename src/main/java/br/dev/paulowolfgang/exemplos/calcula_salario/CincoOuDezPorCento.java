package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public class CincoOuDezPorCento implements RegraDeCalculo {
    
    private static final double LIMITE_SALARIO = 2000;
    private static final double VALOR_DESCONTO_ABAIXO_LIMITE = 0.05;
    private static final double VALOR_DESCONTO_ACIMA_LIMITE = 0.1;

    @Override
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalario() > LIMITE_SALARIO)
        {
            return funcionario.getSalario() * VALOR_DESCONTO_ACIMA_LIMITE;
        }
        return funcionario.getSalario() * VALOR_DESCONTO_ABAIXO_LIMITE;
    }
}
