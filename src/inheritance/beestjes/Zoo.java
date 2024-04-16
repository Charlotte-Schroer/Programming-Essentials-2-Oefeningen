package inheritance.beestjes;

import inheritance.beestjes.eigenschappen.Flies;
import inheritance.beestjes.eigenschappen.Swims;
import inheritance.beestjes.soorten.Bat;
import inheritance.beestjes.soorten.Duck;
import inheritance.beestjes.soorten.Pinguin;
import inheritance.beestjes.soorten.Tiger;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Zoo {

    public static <p> void main(String[] args) {

        List<Swims> pond = new ArrayList<>();
        List<Flies> cage = new ArrayList<>();

        Tiger tiger1 = new Tiger();
        Bat bat1 = new Bat(LocalDate.of(1992, 5, 12));
        Pinguin pinguin1 = new Pinguin();
        Duck duck1 = new Duck();
        Tiger tiger2 = new Tiger();
        Bat bat2 = new Bat(LocalDate.of(1992, 5, 12));
        Pinguin pinguin2 = new Pinguin();
        Duck duck2 = new Duck();

        pond.add(tiger1);
        cage.add(bat1);
        pond.add(pinguin1);
        pond.add(duck1);
        cage.add(duck1);

        for(Swims swimmer: pond){
            Animal animal = (Animal) swimmer;
            animal.makeSound();
        }

        for(Flies flyer: cage){
            Animal animal = (Animal) flyer;
            animal.makeSound();
        }
    }
}
