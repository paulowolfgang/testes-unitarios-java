package br.dev.paulowolfgang.exemplos.nota_fiscal;

/**
 *
 * @author Paulo Silva
 */
public class NfDao implements AcaoAposGerarNota {
    
    @Override
    public void executa(NotaFiscal notaFiscal) {
        // Simulação do fluxo de persistência de NF na base de dados
        System.out.println("Persistindo NF no banco de dados..");
    }
}
