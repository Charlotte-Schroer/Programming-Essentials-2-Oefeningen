package inheritance.beestjes.groepen;

import inheritance.beestjes.Dier;

import java.time.LocalDate;
import java.util.Date;

public abstract class Reptiel extends Dier {

    public Reptiel(LocalDate geboortedatum){
        super(geboortedatum);
    }
    @Override
    public String toString(){
        return "Reptiel geboren op: " + getGeboortedatum();
    }
}
