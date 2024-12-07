package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public class DezOuVintePorCento extends RegraDeCalculo {
    
    private static final double LIMITE_SALARIO = 3000;
    private static final double PORCENTAGEM_BASE = 0.9;
    private static final double PORCENTAGEM_ACIMA_LIMITE = 0.8;

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
