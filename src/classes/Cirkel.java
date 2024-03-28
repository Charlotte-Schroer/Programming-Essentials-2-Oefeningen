package classes;
/*
Maak een klasse Cirkel die als gegevens de straal van de cirkel en de kleur bevat. Zorg voor een aantal constructoren zodat je een Cirkel kan aanmaken zonder parameters, met slechts één argument (straal, kleur) of met beide parameters (straal en kleur). Tenzij anders ingegeven is de straal 0 en de kleur wit. Maak (uiteraard) ook getters en setters. Zorg tenslotte voor de volgende extra methoden:


print() om de cirkel (straal en kleur) af te printen.
geefOmtrek() : 2 * pi * r , met r als straal
geefOppervlakte() : pi * r * r
Voor de waarde van pi kan je Math.PI gebruiken.

 */
public class Cirkel {

    private double straal;
    private String kleur;

    public Cirkel(double straal, String kleur){
        this.straal = straal;
        this.kleur = kleur;
    }
    public Cirkel(){
        this(0.0, "wit");
    }
    public Cirkel(double straal){
        this(straal, "wit");
    }
    public Cirkel(String kleur){
        this(0.0, kleur);
    }
    public void setStraal(double straal){
        this.straal = straal;
    }

    public void setKleur(String kleur){
        this.kleur = kleur;
    }

    public double getStraal(){
        return this.straal;
    }

    public String getKleur(){
        return this.kleur;
    }

    /*public void print(){
        System.out.println("De straal van deze cirkel is: " + straal + " en heeft " + kleur + " als kleur.");
    } */

    @Override
    public String toString(){
        return "Een cirkel met straal " + straal + " en kleur " + kleur;
    }

    public double geefOmtrek(){
        return 2*straal*Math.PI;
    }

    public double geefOppervlakte(){
        return Math.PI*straal*straal;
    }
}
