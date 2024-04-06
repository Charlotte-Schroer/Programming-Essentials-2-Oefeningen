package inheritance.school;

public class Docent extends Personeel {

    private String specialisatie;

    public String getSpecialisatie() {
        return specialisatie;
    }

    public void setSpecialisatie(String specialisatie) {
        this.specialisatie = specialisatie;
    }

    public Docent(String voornaam, String achternaam, String specialisatie, Lokaal lokaal) {
        super(voornaam, achternaam, lokaal);
        setSpecialisatie(specialisatie);
    }

    @Override
    public String toString() {
        return "Docent" + getVoornaam() + " " + getAchternaam() + "\nSpecialisatie: " + specialisatie + "\nLokaal: " + getLokaal();
    }

    //Een docent begeleidt meerdere studenten


}
