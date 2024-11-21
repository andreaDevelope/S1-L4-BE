package dip;

import dip.sottoclassi.DipendenteFullTime;
import dip.sottoclassi.DipendentePartTime;
import dip.sottoclassi.Dirigente;
import dip.sottoclassi.Volontario;

public class TestDipendente {
    public static void main(String[] args) {
        // es1
        // Dipendente dipendente1 = new Dipendente(Dipartimento.AMMINISTRAZIONE, 1, 2500 );
        // Dipendente dipendente2 = new Dipendente(Dipartimento.VENDITE, 2, 5000 );
        // Dipendente dipendente3 = new Dipendente(Dipartimento.PRODUZIONE, 3, 1500 );

        // Dipendente[] dipendenti = new Dipendente[3];
        // dipendenti[0]= dipendente1;
        // dipendenti[1]= dipendente2;
        // dipendenti[2]= dipendente3;
        // for(int i = 0; i < dipendenti.length; i++){
        //     System.out.println(dipendenti[i].getMatricola());
        // }
        //es2

        DipendenteFullTime dipendente1 = new DipendenteFullTime(Dipartimento.VENDITE, 1, 3500);
        DipendentePartTime dipendente2 = new DipendentePartTime(Dipartimento.PRODUZIONE, 2, 800,10);
        Dirigente dipendente3 = new Dirigente(Dipartimento.AMMINISTRAZIONE, 3, 3500);

        Dipendente[] dipendenti = new Dipendente[3];
        dipendenti[0] = dipendente1;
        dipendenti[1] = dipendente2;
        dipendenti[2] = dipendente3;


        double totalSalary=0;
        for(int i = 0; i < dipendenti.length; i++){
            totalSalary += dipendenti[i].getStipendio();
        }
        System.out.println(totalSalary);

        //es3
        Volontario dipendente4 = new Volontario(Dipartimento.PRODUZIONE, 4);

        Dipendente[] dipendenti2 = new Dipendente[4];

        dipendenti2[0] = dipendente1;
        dipendenti2[1] = dipendente2;
        dipendenti2[2] = dipendente3;
        dipendenti2[3] = dipendente4;

        for(int i = 0; i < dipendenti2.length; i++){
            dipendenti2[i].checkIn(7.30);
        }

    }

}
