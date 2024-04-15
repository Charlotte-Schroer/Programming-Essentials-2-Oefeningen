package inheritance.beestjes.groepen;

import inheritance.beestjes.Dier;

import java.time.LocalDate;
import java.util.Date;

public abstract class Vis extends Dier {

    public Vis(LocalDate geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String toString(){
        return "Vis geboren op: " + getGeboortedatum();
    }
}
