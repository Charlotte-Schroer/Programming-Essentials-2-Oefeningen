package inheritance.beestjes;

import java.time.LocalDate;

public abstract class Animal {

    private final LocalDate BIRTHDATE;

    public Animal(LocalDate BIRTHDATE){
        this.BIRTHDATE = BIRTHDATE;
    }

    public Animal(){
        this.BIRTHDATE = LocalDate.now();
    }

    public LocalDate getBIRTHDATE(){
        return BIRTHDATE;
    }

    public abstract void makeSound();

    @Override
    public String toString(){
        return "Animal born on: " + BIRTHDATE;
    }

}
