package inheritance.beestjes.groepen;

import inheritance.beestjes.Animal;

import java.time.LocalDate;

public abstract class Mammal extends Animal {

    public Mammal(){
        super();
    }

    public Mammal(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public String toString(){
        return "Mammal, " + super.toString();
    }
}
