package inheritance.beestjes.groepen;

import inheritance.beestjes.Animal;

import java.time.LocalDate;

public abstract class Reptile extends Animal {

    public Reptile(){
        super();
    }

    public Reptile(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public String toString() {
        return "Reptile, " + super.toString();
    }
}
