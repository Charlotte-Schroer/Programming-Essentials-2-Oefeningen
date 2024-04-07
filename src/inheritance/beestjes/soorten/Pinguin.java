package inheritance.beestjes.soorten;

import inheritance.beestjes.Vogel;

import java.util.Date;

public class Pinguin extends Vogel {

    public Pinguin(Date geboortedatum){
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
