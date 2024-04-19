package enumeraties.medium.deckOfCards;

public class Kaart {
    private WaardeKaart waardeKaart;
    private KleurKaart kleurKaart;

    public WaardeKaart getWaardeKaart() {
        return waardeKaart;
    }

    public KleurKaart getKleurKaart() {
        return kleurKaart;
    }

    public Kaart(KleurKaart kleurKaart, WaardeKaart waardeKaart){
        this.kleurKaart = kleurKaart;
        this.waardeKaart = waardeKaart;
    }

    public String toString(){
        return waardeKaart + " van " + kleurKaart;
    }

    public boolean isHogerdan(Kaart andereKaart){
        return this.waardeKaart.ordinal() > andereKaart.waardeKaart.ordinal();
    }
}
