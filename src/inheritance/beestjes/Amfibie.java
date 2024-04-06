package inheritance.beestjes;

import java.util.Date;

public abstract class Amfibie extends Dier{

    public Amfibie(Date geboortedatum) {
        super(geboortedatum);
    }

    @Override
    public String toString(){
        return "Amfibie geboren op: " + getGeboortedatum();
    }
}
