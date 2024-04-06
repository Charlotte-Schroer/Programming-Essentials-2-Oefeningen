package inheritance;
//nog verder af te werken
import classes.Cirkel;

public class Zwembad2 {
    private double straalZwembad;
    private double breedtePad;
    private Cirkel binnenCirkel;
    private Cirkel buitenCirkel;
    private final double eenheidsprijsPad = 45.0; //per m²
    private final double eenheidsprijsOmheining = 80.75; //per m

    public double getStraalZwembad() {
        return straalZwembad;
    }

    public void setStraalZwembad(double straalZwembad) {
        this.straalZwembad = straalZwembad;
    }

    public double getBreedtePad() {
        return breedtePad;
    }

    public void setBreedtePad(double breedtePad) {
        this.breedtePad = breedtePad;
    }

    public Zwembad2(double straalZwembad, double breedtePad){
        Cirkel binnenCirkel = new Cirkel(straalZwembad);
        Cirkel buitenCirkel = new Cirkel(straalZwembad + breedtePad);
    }

    public double berekenPrijsPad(){

        return (buitenCirkel.geefOppervlakte()-binnenCirkel.geefOppervlakte())*eenheidsprijsPad;
    }

    public double berekenPrijsOmheining(){
        return buitenCirkel.geefOmtrek()*eenheidsprijsOmheining;
    }

    public double berekenTotaalPrijs(){
        return berekenPrijsPad()+berekenPrijsOmheining();
    }

    @Override
    public String toString(){
        return  "Een zwembad met straal: " + straalZwembad + " en een pad met breedte: " + breedtePad + "\nKostprijs pad: " + berekenPrijsPad() +"\n Kostprijs omheining: " + berekenPrijsOmheining() +"\nTotaalprijs van pad & omheining: " + berekenTotaalPrijs();
    }

    public static void main(String[] args) {
        Zwembad2 tuin= new Zwembad2(5, 1.5);
        System.out.println(tuin);
    }
}
