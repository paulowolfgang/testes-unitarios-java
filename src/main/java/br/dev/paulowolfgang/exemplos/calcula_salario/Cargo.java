package br.dev.paulowolfgang.exemplos.calcula_salario;

/**
 *
 * @author Paulo Silva
 */
public enum Cargo {
    
    DESENVOLVEDOR(new DezOuVintePorCento()),
    DBA(new QuinzeOuVinteCincoPorCentro()),
    TESTADOR(new CincoOuDezPorCento());
    
    private final RegraDeCalculo regra;
    
    Cargo(RegraDeCalculo regra)
    {
        this.regra = regra;
    }
    
    public RegraDeCalculo getRegra()
    {
        return regra;
    }
}
