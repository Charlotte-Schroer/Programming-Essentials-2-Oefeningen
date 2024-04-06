package inheritance.beestjes;

import java.util.Date;

public abstract class Vogel extends Dier {
    public Vogel(Date geboortedatum) {
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
