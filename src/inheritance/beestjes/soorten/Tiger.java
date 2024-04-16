package inheritance.beestjes.soorten;

import inheritance.beestjes.eigenschappen.Swims;
import inheritance.beestjes.groepen.Mammal;

import java.time.LocalDate;

public class Tiger extends Mammal implements Swims {

    public Tiger(){
        super();
    }

    public Tiger(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public void makeSound() {
        System.out.println("Tiger roooaars!");
    }

    @Override
    public void swims() {
        System.out.println("A tiger can swim.");
    }
}
