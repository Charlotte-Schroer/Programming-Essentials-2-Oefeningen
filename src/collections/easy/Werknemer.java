package collections.easy;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeMap;

/*
Maak een klasse Werknemer.
Werknemers hebben een naam en skills (specialist glasvezel, kennis elektriciteit, Big data, ...).
Gebruik voor de vaardigheden een gepaste collection, het is niet mogelijk dat een persoon meermaals dezelfde skill heeft.
Maak gebruik van methoden om skills toe te voegen of te verwijderen, je gebruikt hiervoor geen setter.
Laat de methoden een boolean returnen om te weten of het toevoegen of verwijderen is gelukt.
 */
public class Werknemer {

    private String naam;
    private HashSet<String> skills;
    boolean toevoegenGelukt = false;
    boolean verwijderenGelukt = false;

    public  Werknemer(String naam, HashSet<String> skills){
        this.naam = naam;
        this.skills = skills;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public boolean addSkills(String skill){
    skills.add(skill);
    return toevoegenGelukt = true;
    }

    public boolean removeSkills(String skill){
        skills.remove(skill);
        return verwijderenGelukt = true;
    }
}
