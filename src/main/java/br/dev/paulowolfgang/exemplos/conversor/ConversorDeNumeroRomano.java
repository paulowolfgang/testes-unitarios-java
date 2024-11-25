package br.dev.paulowolfgang.exemplos.conversor;

import java.util.HashMap;

/**
 *
 * @author Paulo Silva
 */
public class ConversorDeNumeroRomano {
    
    private static HashMap<String, Integer> tabelaSimbolos = new HashMap<>()
    {{
        put("I", 1);
        put("V", 5);
        put("X", 10);
        put("L", 50);
        put("C", 100);
        put("D", 500);
        put("M", 1000);
    }};
            
    public int converte(String numeroEmRomano)
    {
        return tabelaSimbolos.get(numeroEmRomano);
    }
}
