package inheritance.school;

import classes.Adres;

public class Lokaal {
private Adres adres;
private String gebouw;
private int verdieping;
private int lokaalnummer;

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }

    public String getGebouw() {
        return gebouw;
    }

    public void setGebouw(String gebouw) {
        this.gebouw = gebouw;
    }

    public int getVerdieping() {
        return verdieping;
    }

    public void setVerdieping(int verdieping) {
        this.verdieping = verdieping;
    }

    public int getLokaalnummer() {
        return lokaalnummer;
    }

    public void setLokaalnummer(int lokaalnummer) {
        this.lokaalnummer = lokaalnummer;
    }

    public Lokaal(Adres adres, String gebouw, int verdieping, int lokaalnummer){
    setAdres(adres);
    setGebouw(gebouw);
    setVerdieping(verdieping);
    setLokaalnummer(lokaalnummer);
    }
    @Override
    public String toString(){
        return "Lokaal op Adres: " + getAdres() + "\nGebouw: " + gebouw + " verdieping: " + verdieping + " lokaal: " + lokaalnummer;
    }
}

