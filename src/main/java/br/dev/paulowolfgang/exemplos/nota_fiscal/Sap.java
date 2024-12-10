package br.dev.paulowolfgang.exemplos.nota_fiscal;

/**
 *
 * @author Paulo Silva
 */
public class Sap implements AcaoAposGerarNota {
    
    @Override
    public void executa(NotaFiscal notaFiscal) {
        // Simulação do fluxo de envio de NF para o SAP
        System.out.println("Enviando NF para o SAP..");
    }
}
