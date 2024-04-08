package inheritance.beestjes.soorten;

import inheritance.beestjes.Vogel;

import java.time.LocalDate;
import java.util.Date;

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
