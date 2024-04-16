package inheritance.beestjes.groepen;

import inheritance.beestjes.Animal;

import java.time.LocalDate;

public abstract class Bird extends Animal {

    public Bird(){
        super();
    }

    public Bird(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public String toString(){
        return "Bird, " + super.toString();
    }
}
