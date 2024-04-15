package inheritance.beestjes.groepen.soorten;

import inheritance.beestjes.groepen.Amfibie;

import java.time.LocalDate;

public class Kikker extends Amfibie {

    public Kikker(LocalDate geboortedatum){
        super(geboortedatum);
    }

    @Override
    public String maakGeluid() {
        return "Kwak kwak kwak!";
    }

    public void zwem(){
        System.out.println("Kikker: " + maakGeluid());
    }
}
