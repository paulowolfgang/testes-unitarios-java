package br.dev.paulowolfgang.exemplos.nota_fiscal;

/**
 *
 * @author Paulo Silva
 */
public class TabelaDeImpostos implements Tabela {

    @Override
    public double paraValor(double valor) {
        // Simula cálculo de tarifa de imposto..
        return valor;
    }
}
