package inheritance.beestjes.soorten;

import inheritance.beestjes.eigenschappen.Flies;
import inheritance.beestjes.eigenschappen.Swims;
import inheritance.beestjes.groepen.Bird;

import java.time.LocalDate;

public class Duck extends Bird implements Swims, Flies {

    public Duck(){
        super();
    }

    public Duck(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public void makeSound() {
        System.out.println("Duck kwek-kwek-kweks!!");
    }

    @Override
    public void swims() {
        System.out.println("A duck will fly.");
    }

    @Override
    public void flies(){
        System.out.println("A duck will swim.");
    }
}
