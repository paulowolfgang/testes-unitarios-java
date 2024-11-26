package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public class CalculadoraDeSalario
{
    private static final double DESENVOLVEDOR_LIMITE_SALARIO = 3000;
    private static final double DESENVOLVEDOR_VALOR_DESCONTO_ACIMA_LIMITE = 0.8;
    private static final double DESENVOLVEDOR_VALOR_DESCONTO_ABAIXO_LIMITE = 0.9;
    
    private static final double DBA_LIMITE_SALARIO = 2500;
    private static final double DBA_VALOR_DESCONTO_ACIMA_LIMITE = 0.75;
    private static final double DBA_VALOR_DESCONTO_ABAIXO_LIMITE = 0.85;
    
    private static final double TESTADOR_LIMITE_SALARIO = 2000;
    private static final double TESTADOR_VALOR_DESCONTO_ACIMA_LIMITE = 0.1;
    private static final double TESTADOR_VALOR_DESCONTO_ABAIXO_LIMITE = 0.05;
    
    public double calculaSalario(Funcionario funcionario)
    {
        switch (funcionario.getCargo()) {
            case DESENVOLVEDOR -> {
                if(funcionario.getSalario() > DESENVOLVEDOR_LIMITE_SALARIO)
                {
                    return funcionario.getSalario() * DESENVOLVEDOR_VALOR_DESCONTO_ACIMA_LIMITE;
                }
                return funcionario.getSalario() * DESENVOLVEDOR_VALOR_DESCONTO_ABAIXO_LIMITE;
            }
            case DBA -> {
                if(funcionario.getSalario() > DBA_LIMITE_SALARIO)
                {
                    return funcionario.getSalario() * DBA_VALOR_DESCONTO_ACIMA_LIMITE;
                }
                return funcionario.getSalario() * DBA_VALOR_DESCONTO_ABAIXO_LIMITE;
            }
            default -> {
                if(funcionario.getSalario() > TESTADOR_LIMITE_SALARIO)
                {
                    return funcionario.getSalario() * TESTADOR_VALOR_DESCONTO_ACIMA_LIMITE;
                }
                return funcionario.getSalario() * TESTADOR_VALOR_DESCONTO_ABAIXO_LIMITE;
            }
        }
    }
}
