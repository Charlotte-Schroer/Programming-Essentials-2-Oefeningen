package inheritance.beestjes.soorten;

import inheritance.beestjes.eigenschappen.Swims;
import inheritance.beestjes.groepen.Amphibian;

import java.time.LocalDate;

public class Frog extends Amphibian implements Swims {

    public Frog(){
        super();
    }

    public Frog(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public void makeSound() {
        System.out.println("Frog quacks!!!");
    }

    @Override
    public void swims() {
        System.out.println("A frog can swim");
    }
}
