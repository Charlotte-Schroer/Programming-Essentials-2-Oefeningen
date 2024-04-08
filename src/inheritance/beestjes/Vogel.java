package inheritance.beestjes;

import java.time.LocalDate;
import java.util.Date;

public abstract class Vogel extends Dier {
    public Vogel(LocalDate geboortedatum) {
        super(geboortedatum);
    }

    @Override
    public String toString(){
        return "Vogel geboren op: " + getGeboortedatum();
    }

    public void vlieg(){
        /* vliegt weg */
    }
}
