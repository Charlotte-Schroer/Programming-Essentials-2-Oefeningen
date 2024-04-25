package extra.oef2;

public class Kaart {

    private Waarde waarde;
    private Kleur kleur;

    public Kaart(Kleur kleur, Waarde waarde) {
        this.waarde = waarde;
        this.kleur = kleur;
    }

    public Waarde getWaarde() {
        return waarde;
    }

    public void setWaarde(Waarde waarde) {
        this.waarde = waarde;
    }

    public Kleur getKleur() {
        return kleur;
    }

    public void setKleur(Kleur kleur) {
        this.kleur = kleur;
    }

    @Override
    public String toString() {
        return "Kaart{" +
                "waarde=" + waarde +
                ", kleur=" + kleur +
                '}';
    }

    public boolean hogerDan(Kaart kaart){
       return this.waarde.compareTo(kaart.waarde)>0;
    }
}
