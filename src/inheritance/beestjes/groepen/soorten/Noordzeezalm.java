package inheritance.beestjes.groepen.soorten;

import inheritance.beestjes.groepen.Vis;

import java.time.LocalDate;

public class Noordzeezalm extends Vis {

    public Noordzeezalm(LocalDate geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "BlubBlubBlub!";
    }
    public void zwem(){
        System.out.println("Noordzeezalm: " + maakGeluid());
    }
}
