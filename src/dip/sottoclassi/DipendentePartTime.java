package dip.sottoclassi;

import dip.Dipartimento;
import dip.Dipendente;

public class DipendentePartTime extends Dipendente {
    private int oreSettimanali;
    private double pagaOraria;

    public DipendentePartTime(Dipartimento dipartimento, int matricola, int oreSettimanali, double pagaOraria) {
        super(dipartimento, matricola, oreSettimanali * pagaOraria );
        this.oreSettimanali = oreSettimanali;
        this.pagaOraria = pagaOraria;
    }

    public double calculateSalary(){
        double salario = this.oreSettimanali * this.pagaOraria;
        return salario;
    }

    public int getOreSettimanali() {
        return oreSettimanali;
    }

    public void setOreSettimanali(int oreSettimanali) {
        this.oreSettimanali = oreSettimanali;
    }

    public double getPagaOraria() {
        return pagaOraria;
    }

    public void setPagaOraria(double pagaOraria) {
        this.pagaOraria = pagaOraria;
    }

    @Override
    public void checkIn() {

    }
}
