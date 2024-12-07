package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public class CincoOuDezPorCento extends RegraDeCalculo {
    
    private static final double LIMITE_SALARIO = 2000;
    private static final double PORCENTAGEM_BASE = 0.05;
    private static final double PORCENTAGEM_ACIMA_LIMITE = 0.1;

    @Override
    protected double limite() {
        return LIMITE_SALARIO;
    }
    
    @Override
    protected double porcentagemBase() {
        return PORCENTAGEM_BASE;
    }

    @Override
    protected double porcentagemAcimaDoLimite() {
        return PORCENTAGEM_ACIMA_LIMITE;
    }
}
