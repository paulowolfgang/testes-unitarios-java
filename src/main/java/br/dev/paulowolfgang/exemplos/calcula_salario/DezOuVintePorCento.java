package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public class DezOuVintePorCento implements RegraDeCalculo {
    
    private static final double LIMITE_SALARIO = 3000;
    private static final double VALOR_DESCONTO_ABAIXO_LIMITE = 0.9;
    private static final double VALOR_DESCONTO_ACIMA_LIMITE = 0.8;

    @Override
    public double calcula(Funcionario funcionario) {
        if(funcionario.getSalario() > LIMITE_SALARIO)
        {
            return funcionario.getSalario() * VALOR_DESCONTO_ACIMA_LIMITE;
        }
        return funcionario.getSalario() * VALOR_DESCONTO_ABAIXO_LIMITE;
    }
}
