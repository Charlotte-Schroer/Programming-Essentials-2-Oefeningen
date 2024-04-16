package inheritance.beestjes.groepen;

import inheritance.beestjes.Animal;

import java.time.LocalDate;

public abstract class Amphibian extends Animal {

    public Amphibian(){
        super();
    }

    public Amphibian(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public String toString(){
        return "Amphibian, " + super.toString();
    }
}
