package inheritance.beestjes.soorten;

import inheritance.beestjes.Vis;

import java.util.Date;

public class Noordzeezalm extends Vis {

    public Noordzeezalm(Date geboortedatum){
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
