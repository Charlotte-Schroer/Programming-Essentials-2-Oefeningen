package exceptions.easy;

import java.time.LocalDate;
import java.util.HashMap;


public class Klant {

    private String naam;
    private LocalDate aankoopdatum;
    public HashMap<Boek,LocalDate> boodschappenmand;

    public Klant(String naam, HashMap<Boek, LocalDate>boodschappenmand){
        this.naam = naam;
        this.boodschappenmand = boodschappenmand;
    }
    public Klant(String naam){
        this.naam = naam;
        boodschappenmand = new HashMap<>();
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public LocalDate getAankoopdatum() {
        return aankoopdatum;
    }

    public void setAankoopdatum(LocalDate aankoopdatum) {
        this.aankoopdatum = aankoopdatum;
    }

    public HashMap<Boek, LocalDate> getBoodschappenmand() {
        return boodschappenmand;
    }

    public void setBoodschappenmand(HashMap<Boek, LocalDate> boodschappenmand) {
        this.boodschappenmand = boodschappenmand;
    }

    public void toevoegenAanMandje(Boek boek){
        if(aankoopdatum==null){
            boodschappenmand.put(boek, LocalDate.now());
        } else {
            boodschappenmand.put(boek, aankoopdatum);
        }
    }

    public void verwijderUitMandje(Boek boek) throws BoekNietInMandjeException{
        if(!boodschappenmand.containsKey(boek)){
            throw new BoekNietInMandjeException("Boek \"" + boek.getTitel() + "\" niet in mijn mandje");
        }
        boodschappenmand.remove(boek);
    }

    @Override
    public String toString() {
        return "Klant{" +
                "naam='" + naam + '\'' +
                ", boodschappenmand=" + boodschappenmand +
                '}';
    }
}
