package inheritance.beestjes.groepen.soorten;

import inheritance.beestjes.groepen.Vogel;

import java.time.LocalDate;

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
