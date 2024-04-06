package inheritance.beestjes.soorten;

import inheritance.beestjes.Amfibie;
import inheritance.beestjes.Dier;

import java.util.Date;

public class Kikker extends Amfibie {

    public Kikker(Date geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "Kwak kwak kwak!";
    }
}
