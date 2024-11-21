package dip.sottoclassi;

import dip.Dipartimento;
import dip.Dipendente;

public class Volontario extends Dipendente {
    public Volontario(Dipartimento dipartimento, int matricola) {
        super(dipartimento, matricola, 0);
    }

    @Override
    public void checkIn() {

    }
}
