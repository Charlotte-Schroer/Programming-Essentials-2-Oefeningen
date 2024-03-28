package classes;
/*
Maak een klasse Auto. Een auto heeft een kilometerteller, een brandstoftank met een inhoud in liter en een verbruik (aantal liter per 100km). Gebruik voor deze gegevens een double als datatype.

Voorzie minstens twee constructors, één die toelaat aan alle gegevens een beginwaarde te geven en één die werkt met een aantal default waarden (nieuwe auto, lege tank). Je hoeft geen bijkomende controles uit te voeren. Je mag er van uitgaan dat de gebruiker altijd realistische waarden gebruikt.

Voorzie een methode om de tank bij te vullen (altijd tot ze vol is). Voorzie een methode om een gegeven aantal km te rijden. In dit geval telt de kilometerteller altijd vooruit (ook alsje een negatief getal ingeeft). Er wordt steeds brandstof verbruikt. Hou er rekening mee dat er mogelijk te weinig brandstof kan zijn om de volledige afstand te rijden. In dat geval wordt er gereden tot de tank leeg is. In alle andere gevallen geeft de methode het aantal gereden km als returnwaarde.

Voorzie ook een methode om alle relevante gegevens van een Auto object af te drukken.
 */
public class Auto{

    private double inhoudBrandstoftank;
    private double verbruik;
    public double kilometerteller;
    public double hoeveelheidBrandstof;

public Auto(double kilometerteller, double hoeveelheidBrandstof){
    this.inhoudBrandstoftank;
    this.verbruik;

}
public void setKilometerteller(double kilometerteller){
    this.kilometerteller = kilometerteller;
}
public void setHoeveelheidBrandstof(double hoeveelheidBrandstof){
    this.hoeveelheidBrandstof = hoeveelheidBrandstof;
}
}
