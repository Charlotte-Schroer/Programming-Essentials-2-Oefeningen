package classes;
/*
Maak een klasse Auto. Een auto heeft een kilometerteller, een brandstoftank met een inhoud in
liter en een verbruik (aantal liter per 100km). Gebruik voor deze gegevens een double als datatype.
Voorzie minstens twee constructors, één die toelaat aan alle gegevens een
beginwaarde te geven en één die werkt met een aantal default waarden (nieuwe auto, lege tank).
Je hoeft geen bijkomende controles uit te voeren. Je mag er van uitgaan dat de gebruiker altijd realistische waarden gebruikt.
Voorzie een methode om de tank bij te vullen (altijd tot ze vol is). Voorzie een methode om een gegeven aantal km te rijden.
In dit geval telt de kilometerteller altijd vooruit (ook alsje een negatief getal ingeeft). Er wordt steeds brandstof verbruikt.
Hou er rekening mee dat er mogelijk te weinig brandstof kan zijn om de volledige afstand te rijden. In dat geval wordt er gereden tot de tank leeg is.
In alle andere gevallen geeft de methode het aantal gereden km als returnwaarde.
Voorzie ook een methode om alle relevante gegevens van een Auto object af te drukken.
 */


public class Auto{

private double kilometerteller;
private double brandstof;
private double verbruik;
private double maxBrandstof;


    public Auto(double kilometerteller, double brandstof, double verbruik){
    setKilometerteller(kilometerteller);
    setBrandstof(brandstof);
    setVerbruik(verbruik);
    maxBrandstof = 50.0;
}
//default auto
    public Auto(){
        this(7.5);
    }
    //consumptie wel meegeven
    public Auto(double verbruik){
        this(0.0, 0.0, verbruik );
    }

//enkel de fabrikant kan dit instellen
    private void setKilometerteller(double kilometerteller) {
        this.kilometerteller = kilometerteller;
    }

   private void setBrandstof(double brandstof) {
        this.brandstof = brandstof;
    }

    private void setVerbruik(double verbruik) {
        this.verbruik = verbruik;
    }

    public void fillTank(){
        brandstof = maxBrandstof;
    }

    public void printAuto(){
        System.out.println("Auto met " + kilometerteller + " km op de teller en een verbruik van " + verbruik + " liter per 100 km heeft " + brandstof + " in de tank.");
    }

    public double drive(double afstand){
        afstand = Math.abs(afstand);
        double brandstofNodig = afstand / 100 * verbruik;
        if(brandstofNodig > brandstof){
          afstand = brandstof * 100 / verbruik;
          brandstof = 0;
        } else {
            brandstof -= brandstofNodig;
        }
        kilometerteller += afstand;
        return afstand;
    }

    @Override
    public String toString(){
        return "Auto met " + kilometerteller + " km op de teller en een verbruik van " + verbruik + " liter per 100 km(" + brandstof + " in de tank en een max hoeveelheid van " +maxBrandstof+ "liter)";
    };
}
