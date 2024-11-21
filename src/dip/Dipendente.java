package dip;

public abstract class Dipendente implements ICheckIn {
    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    public Dipendente(Dipartimento dipartimento, int matricola, double stipendio) {
        this.dipartimento = dipartimento;
        this.matricola = matricola;
        this.stipendio = stipendio;
    }

    public double getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    public int getMatricola() {
        return matricola;
    }

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    public void checkIn(double orario){
        System.out.println("INIZIO TURNO ALLE: " + orario);

    }

}
