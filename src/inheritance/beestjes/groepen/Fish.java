package inheritance.beestjes.groepen;

import inheritance.beestjes.Animal;

import java.time.LocalDate;

public abstract class Fish extends Animal {

    public Fish(){
        super();
    }

    public Fish(LocalDate BIRTHDATE){
        super(BIRTHDATE);
    }

    @Override
    public String toString(){
        return "Fish, " + super.toString();
    }
}
