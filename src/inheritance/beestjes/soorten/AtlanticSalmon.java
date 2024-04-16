package inheritance.beestjes.soorten;

import inheritance.beestjes.eigenschappen.Swims;
import inheritance.beestjes.groepen.Fish;

import java.time.LocalDate;

public class AtlanticSalmon extends Fish implements Swims {

    public AtlanticSalmon(){
        super();
    }

    public AtlanticSalmon(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public void makeSound() {
        System.out.println("Atlantic Salmon blub-blub-blubs");
    }

    @Override
    public void swims() {
        System.out.println("An atlantic Salmon will swim.");
    }
}
