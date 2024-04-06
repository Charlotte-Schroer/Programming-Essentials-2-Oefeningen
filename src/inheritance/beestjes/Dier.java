package inheritance.beestjes;

import java.util.Date;

public abstract class Dier {
    private Date geboortedatum;

    public Date getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(Date geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public Dier(Date geboortedatum){
        this.geboortedatum = geboortedatum;
    }

    @Override
    public String toString() {
        return "Dier geboren op: " + geboortedatum;
    }
    public abstract String maakGeluid();

}
