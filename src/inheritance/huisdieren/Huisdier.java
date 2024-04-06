package inheritance.huisdieren;

public class Huisdier {
    private String naam;
    private double gewicht;
    private int leeftijd;

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public Huisdier(String naam, double gewicht, int leeftijd){
        setNaam(naam);
        setGewicht(gewicht);
        setLeeftijd(leeftijd);
    }
    @Override
    public String toString(){
        return "Huisdier met naam " + naam +"\ngewicht: " + gewicht + "kg\nleeftijd: " + leeftijd +" jaar oud";
    }

}
