package br.dev.paulowolfgang.exemplos.nota_fiscal;

import java.util.Calendar;

/**
 *
 * @author Paulo Silva
 */
public class RelogioDoSistema implements Relogio {

    @Override
    public Calendar hoje() {
        return Calendar.getInstance();
    }
}
