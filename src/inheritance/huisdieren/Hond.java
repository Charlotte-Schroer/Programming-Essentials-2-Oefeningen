package inheritance.huisdieren;

public class Hond extends Huisdier{
    private int stamboomnummer;

    public Hond(String naam, double gewicht, int leeftijd, int stamboomnummer){
        super(naam, gewicht, leeftijd);
        setStamboomnummer(stamboomnummer);
    }

    public int getStamboomnummer() {
        return stamboomnummer;
    }

    public void setStamboomnummer(int stamboomnummer) {
        this.stamboomnummer = stamboomnummer;
    }
    @Override
    public String toString(){
        return super.toString() + "\nHond met stamboomnummer: " + stamboomnummer;
    }
}
