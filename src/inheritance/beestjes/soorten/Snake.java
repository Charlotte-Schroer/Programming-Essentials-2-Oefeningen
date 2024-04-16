package inheritance.beestjes.soorten;

import inheritance.beestjes.eigenschappen.Swims;
import inheritance.beestjes.groepen.Reptile;

import java.time.LocalDate;

public class Snake extends Reptile implements Swims {

    public Snake(){
        super();
    }

    public Snake(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public void makeSound() {
        System.out.println("Snake sssssssssssssssssss'es!");
    }

    @Override
    public void swims() {
        System.out.println("A snake can swim.");
    }
}
