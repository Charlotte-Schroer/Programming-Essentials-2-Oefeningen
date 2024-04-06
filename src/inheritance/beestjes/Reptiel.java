package inheritance.beestjes;

import java.util.Date;

public abstract class Reptiel extends Dier {

    public Reptiel(Date geboortedatum){
        super(geboortedatum);
    }
    @Override
    public String toString(){
        return "Reptiel geboren op: " + getGeboortedatum();
    }
}
