package inheritance.school;

public class Bediende extends Personeel{
    public Bediende(String voornaam, String naam, Lokaal lokaal){
        super(voornaam, naam, lokaal);
    }
    @Override
    public String toString(){
        return "Bediende" + getVoornaam()+" " + getAchternaam() +"\nLokaal: " + getLokaal();
    }
}
