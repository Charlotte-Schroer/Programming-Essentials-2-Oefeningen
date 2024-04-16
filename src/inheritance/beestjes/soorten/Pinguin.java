package inheritance.beestjes.soorten;

import inheritance.beestjes.eigenschappen.Swims;
import inheritance.beestjes.groepen.Bird;

import java.time.LocalDate;

public class Pinguin extends Bird implements Swims {

    public Pinguin(){
        super();
    }

    public Pinguin(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public void makeSound() {
        System.out.println("Pinguin makes a pinguin-sound!");
    }

    @Override
    public void swims() {
        System.out.println("A pinguin can swim.");
    }
}
