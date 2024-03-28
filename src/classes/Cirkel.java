package classes;

public class Cirkel {

    private double straal;
    private String kleur;
    public Cirkel(){
        this.straal = 0;
        this.kleur = "wit";
    }
    public Cirkel(float straal, String kleur){
        this.straal = straal;
        this.kleur = kleur;
    }

    public void setStraal(float straal){
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

    public void print(){
        System.out.println("De straal van deze cirkel is: " + straal + " en heeft " + kleur + " als kleur.");
    }

    public double geefOmtrek(){
        return 2*straal*Math.PI;
    }

    public double geefOppervlakte(){
        return Math.PI*straal*straal;
    }
}
