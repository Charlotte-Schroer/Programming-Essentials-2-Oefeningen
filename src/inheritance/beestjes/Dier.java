package inheritance.beestjes;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public abstract class Dier {
    private LocalDate geboortedatum;
    public String kooi[];
    public String vijver[];
    public int dierenKooi;
    public int dierenVijver;

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public Dier(LocalDate geboortedatum){
        this.geboortedatum = geboortedatum;
        kooi = new String[100];
        vijver = new String[100];
        dierenKooi = 0;
        dierenVijver = 0;
    }

    @Override
    public String toString() {
        return "Dier geboren op: " + geboortedatum;
    }
    public abstract String maakGeluid();
    public void addKooi(){

    }
    public void addVijver(){

    }

}
