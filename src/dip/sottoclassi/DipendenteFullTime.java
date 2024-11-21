package dip.sottoclassi;

import dip.Dipartimento;
import dip.Dipendente;

public class DipendenteFullTime extends Dipendente {

    public DipendenteFullTime(Dipartimento dipartimento, int matricola, double stipendio) {
        super(dipartimento, matricola, stipendio);
    }



    @Override
    public void checkIn() {

    }
}
