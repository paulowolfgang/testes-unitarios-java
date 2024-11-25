package br.dev.paulowolfgang.exemplos.conversor;

/**
 *
 * @author Paulo Silva
 */
public class ConversorDeNumeroRomano {
    
    public int converte(String numeroEmRomano)
    {
        if(numeroEmRomano.equals("I"))
        {
            return 1;
        }else if(numeroEmRomano.equals("V")){
            return 5;
        }
        return 0;
    }
}
