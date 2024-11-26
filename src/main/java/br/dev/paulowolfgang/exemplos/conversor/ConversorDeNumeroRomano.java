package br.dev.paulowolfgang.exemplos.conversor;

import java.util.HashMap;

/**
 *
 * @author Paulo Silva
 */
public class ConversorDeNumeroRomano {
    
    private static final HashMap<Character, Integer> tabelaSimbolos = new HashMap<>()
    {{
        put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};
            
    public int converte(String numeroEmRomano)
    {
        int acumulador = 0;
        int ultimoVizinhoDaDireita = 0;
        
        for(int i = numeroEmRomano.length() - 1; i >= 0; i--)
        {
            int atual = tabelaSimbolos.get(numeroEmRomano.charAt(i));
            int multiplicador = 1;
            if(atual < ultimoVizinhoDaDireita)
            {
                multiplicador = -1;
            }
            
            acumulador += atual * multiplicador;
            ultimoVizinhoDaDireita = atual;
        }
        return acumulador;
    }
}
