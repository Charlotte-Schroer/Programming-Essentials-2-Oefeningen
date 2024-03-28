package classes;
/*
Maak een klasse Adres. Een object van de klasse kan de adresgegevens van een persoon bijhouden. Een adres bevat minstens de volgende gegevens:

straatnaam
huisnummer (enkel cijfers)
bus
postcode (exact 4 cijfers)
woonplaats
Denk zelf na over de meest geschikte types om bv. tekst of getallen bij te houden.
Zorg er voor dat je zeker een constructor hebt waar je alles aan kan meegeven. Zorg ook voor getters en setters. Voeg ook nog een functie toe waarmee je alle gegevens in de console kan afdrukken. Als uitdaging voorzie je ook nog een controle bij het invoeren van een postcode, dit moet uit exact 4 cijfers bestaan en anders vervang je de invoer door 9999.
 */

public class Adres {

    private String straatnaam;
    private int huisnummer;
    private char bus;
    private int postcode;
    private String woonplaats;

public Adres(String straatnaam, int huisnummer, char bus, int postcode, String woonplaats){
    setStraatnaam(straatnaam);
    setHuisnummer(huisnummer);
    setBus(bus);
    setPostcode(postcode);
    setWoonplaats(woonplaats);
}
public Adres(String straatnaam, int huisnummer, int postcode, String woonplaats){
        setStraatnaam(straatnaam);
        setHuisnummer(huisnummer);
        this.bus = '/';
        setPostcode(postcode);
        setWoonplaats(woonplaats);
    }
public void setStraatnaam(String straatnaam){
    this.straatnaam = straatnaam;
}
public void setHuisnummer(int huisnummer){
    this.huisnummer = huisnummer;
}
public void setBus(char bus){
    this.bus = bus;
}
public void setPostcode(int postcode){
    if(postcode>999 && postcode<10000){
        this.postcode = postcode;
    } else {
        this.postcode = 9999;
    }
}
public void setWoonplaats(String woonplaats){
    this.woonplaats = woonplaats;
}

public String getStraatnaam(){
    return straatnaam;
}
public int getHuisnummer() {
    return huisnummer;
    }
public char getBus() {
    return bus;
    }
public int getPostcode(){
    return postcode;
}
public String getWoonplaats() {
    return woonplaats;
    }
@Override
    public String toString(){
    return "Adres: " + straatnaam + " " + huisnummer + " bus: " + bus + ", " + postcode + " " + woonplaats;
}
}

