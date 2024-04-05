package inheritance;

import classes.Cirkel;

import static java.lang.Math.round;

/*
We maken een klasse Zwembad om een offerte te kunnen opstellen voor de bouw van zwembaden.
Een zwembad zal bestaan uit een cirkelvormig reservoir water, een pad er rond en een omheining rond het pad.
Je kan het jezelf gemakkelijker maken door gebruik te maken van de klasse Cirkel uit de oefeningen voor Classes,
dit helpt voor de berekeningen.
Om dit voor te stellen hebben we enkele gegevens nodig:

de straal van het zwembad zelf
de breedte van het pad
de prijs voor het pad, we gaan er van uit dat dit een prijs per vierkante meter is, bv. 45 €/m²
de prijs voor de omheining, we gaan er van uit dat dit een prijs is per meter, bv. 80.75 €/m
Binnen deze klasse schrijf je functies uit om het volgende te berekenen:

De prijs van het pad
De prijs van de omheining
De totale prijs hiervoor
 */
public class Zwembad{

    private Cirkel binnensteCirkel;
    private Cirkel buitensteCirkel;
    private final double eenheidsprijsPad = 45.0; //per m²
    private final double eenheidsprijsOmheining = 80.75; //per m


    public Cirkel getBinnensteCirkel() {
        return binnensteCirkel;
    }

    public void setBinnensteCirkel(Cirkel binnensteCirkel) {
        this.binnensteCirkel = binnensteCirkel;
    }

    public Cirkel getBuitensteCirkel() {
        return buitensteCirkel;
    }

    public void setBuitensteCirkel(Cirkel buitensteCirkel) {
        this.buitensteCirkel = buitensteCirkel;
    }

    // breedte van het pad:
    public double getBreedtePad(){
        if(binnensteCirkel.getStraal()>buitensteCirkel.getStraal()){
            System.out.println("Error geen pad voorzien!");
            return 0;
        }else{
        return buitensteCirkel.getStraal()- binnensteCirkel.getStraal();
        }
    }

    public double berekenPrijsPad(){
        if(getBreedtePad()>0){
        return (buitensteCirkel.geefOppervlakte()-binnensteCirkel.geefOppervlakte())*eenheidsprijsPad;
        }else{
            return 0;
        }
    }

    public double berekenPrijsOmheining(){
        double prijs;
        prijs = buitensteCirkel.geefOmtrek()*eenheidsprijsOmheining;
        return prijs;
    }

    public double totaalPrijs(){
        return berekenPrijsOmheining()+berekenPrijsPad();
    }
    @Override
    public String toString(){
        return "Een zwembad met een pad van " + getBreedtePad() + "m  \nprijs van het pad: " + berekenPrijsPad() + "\nprijs van de omheining " + berekenPrijsOmheining() +"\ntotaalprijs: " + totaalPrijs();
    }

    public static void main(String[] args) {
        Zwembad tuinbad = new Zwembad();
        tuinbad.setBinnensteCirkel(new Cirkel(5.0));
        tuinbad.setBuitensteCirkel(new Cirkel(6.0));
        System.out.println(tuinbad);
    }
}
