package inheritance.beestjes.soorten;

import inheritance.beestjes.Dier;
import inheritance.beestjes.Vogel;

import java.time.LocalDate;
import java.util.Date;

public class Eend extends Vogel {

    public Eend(LocalDate geboortedatum){
        super(geboortedatum);
    }
    @Override
    public String maakGeluid() {
        return "Kwek kwek kwek!";
    }

    public void zwem(){
        System.out.println("Eend: " +maakGeluid());
    }
    public void vlieg(){
        System.out.println("Eend: " + maakGeluid());
    }
}
