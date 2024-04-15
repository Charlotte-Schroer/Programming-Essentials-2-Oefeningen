package inheritance.beestjes.groepen;

import inheritance.beestjes.Dier;

import java.time.LocalDate;
import java.util.Date;

public abstract class Zoogdier extends Dier {
    public Zoogdier(LocalDate geboortedatum) {
        super(geboortedatum);
    }

    @Override
    public String toString(){
        return "Zoogdier geboren op: " + getGeboortedatum();
    }
}
