package enumeraties.medium.deckOfCards;

public class Kaart {
    private WaardeKaart waardeKaart;
    private KleurKaart kleurKaart;

    public Kaart(KleurKaart kleurKaart, WaardeKaart waardeKaart){
        this.kleurKaart = kleurKaart;
        this.waardeKaart = waardeKaart;
    }
    public String toString(){
        return waardeKaart + " van " + kleurKaart;
    }
}
