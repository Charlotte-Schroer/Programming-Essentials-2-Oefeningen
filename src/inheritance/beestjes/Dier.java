package inheritance.beestjes;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

public abstract class Dier {
    private LocalDate geboortedatum;

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public Dier(LocalDate geboortedatum){
        this.geboortedatum = geboortedatum;
    }

    @Override
    public String toString() {
        return "Dier geboren op: " + geboortedatum;
    }
    public abstract String maakGeluid();

}
