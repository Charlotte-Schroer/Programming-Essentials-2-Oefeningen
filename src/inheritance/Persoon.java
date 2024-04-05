package inheritance;

import classes.Adres;

/*
Maak een klasse Persoon, van een persoon willen we de volgende gegevens opslaan:

Voornaam
Achternaam
email
adres (Object van klasse Adres, dat mag je uit de oefeningen van Classes overnemen)

Zorg voor een constructor waar je een persoon kan aanmaken met een voor- en achternaam.
Overschrijf ook nog de toString methode om de gegevens te kunnen afdrukken.
Om te testen of alles werkt maak je in je main klasse twee personen aan en geef je hen een adres.
Druk hun gegevens af om te controleren of correct is ingegeven.

Als uitdaging zoek je nog een manier toe om te tellen hoeveel personen er in totaal zijn aangemaakt.
Hiervoor kan je gebruik maken van static.
 */


public class Persoon {
    private static int aantalPersonen = 0;
    private String voornaam;
    private  String achternaam;
    private  String email;
    private Adres adres;

    public Persoon(String voornaam, String achternaam){
    aantalPersonen++;
    this.voornaam = voornaam;
    this.achternaam = achternaam;
    }
@Override public String toString(){
        return "Persoon:" + voornaam + " " + achternaam + "\nemail: " + email + "\nadres: " + adres;
}
    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Adres getAdres() {
        return adres;
    }

    public void setAdres(Adres adres) {
        this.adres = adres;
    }
    public static int getAantalPersonen(){
        return aantalPersonen;
    }
}
