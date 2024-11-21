package dip.sottoclassi;

import dip.Dipartimento;
import dip.Dipendente;

public class Dirigente extends Dipendente {
    public Dirigente(Dipartimento dipartimento, int matricola, double stipendio) {
        super(dipartimento, matricola, stipendio);
    }


    @Override
    public void checkIn() {

    }
}
