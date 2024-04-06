package inheritance.school;

import inheritance.Persoon;

public class Personeel extends Persoon{
    private Lokaal lokaal;

    public Lokaal getLokaal() {
        return lokaal;
    }

    public void setLokaal(Lokaal lokaal) {
        this.lokaal = lokaal;
    }

    public Personeel(String voornaam, String achternaam, Lokaal lokaal){
        super(voornaam, achternaam);
        setLokaal(lokaal);
    }
    @Override
    public String toString(){
        return "Personeel: " + super.toString() + "\nLokaal: " + getLokaal();
    }
}
