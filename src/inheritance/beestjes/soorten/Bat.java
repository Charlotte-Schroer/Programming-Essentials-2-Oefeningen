package inheritance.beestjes.soorten;

import inheritance.beestjes.eigenschappen.Flies;
import inheritance.beestjes.groepen.Mammal;

import java.time.LocalDate;

public class Bat extends Mammal implements Flies {

    public Bat(){
        super();
    }

    public Bat(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public void makeSound() {
        System.out.println("Bat ssqqqqqqccchhhhhh.");
    }

    @Override
    public void flies(){
        System.out.println("A bat will fly!");
    }
}
