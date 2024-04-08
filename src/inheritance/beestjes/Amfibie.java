package inheritance.beestjes;

import java.time.LocalDate;
import java.util.Date;

public abstract class Amfibie extends Dier{

    public Amfibie(LocalDate geboortedatum) {
        super(geboortedatum);
    }

    @Override
    public String toString(){
        return "Amfibie geboren op: " + getGeboortedatum();
    }
}
