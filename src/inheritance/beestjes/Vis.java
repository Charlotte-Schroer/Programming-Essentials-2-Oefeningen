package inheritance.beestjes;

import java.util.Date;

public abstract class Vis extends Dier {

    public Vis(Date geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String toString(){
        return "Vis geboren op: " + getGeboortedatum();
    }
}
