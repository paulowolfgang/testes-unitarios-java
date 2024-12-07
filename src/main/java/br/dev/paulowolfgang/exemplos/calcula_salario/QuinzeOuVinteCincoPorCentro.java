package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public class QuinzeOuVinteCincoPorCentro extends RegraDeCalculo {
    
    private static final double LIMITE_SALARIO = 2500;
    private static final double PORCENTAGEM_BASE = 0.85;
    private static final double PORCENTAGEM_ACIMA_LIMITE = 0.75;

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
