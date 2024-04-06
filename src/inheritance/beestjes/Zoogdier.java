package inheritance.beestjes;

import java.util.Date;

public abstract class Zoogdier extends Dier {
    public Zoogdier(Date geboortedatum) {
        super(geboortedatum);
    }

    @Override
    public String toString(){
        return "Zoogdier geboren op: " + getGeboortedatum();
    }
}
