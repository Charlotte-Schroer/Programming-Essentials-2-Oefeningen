package inheritance.beestjes.groepen.soorten;

import inheritance.beestjes.groepen.Vogel;

import java.time.LocalDate;

public class Pinguin extends Vogel {

    public Pinguin(LocalDate geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "Pinguin!";
    }

    public void zwem(){
        System.out.println("Pinguin: " + maakGeluid());
    }
}
