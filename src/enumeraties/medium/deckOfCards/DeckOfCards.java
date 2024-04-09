package enumeraties.medium.deckOfCards;


import java.util.Arrays;

public class DeckOfCards {
    public static void main(String[] args) {
    Kaart[][] deckOfCards = new Kaart[4][13];
    for(KleurKaart kleurKaart : KleurKaart.values()){
        for(WaardeKaart waardeKaart : WaardeKaart.values()){
            int kleurIndex = kleurKaart.ordinal();
            int waardeIndex = waardeKaart.ordinal();
            deckOfCards[kleurIndex][waardeIndex] = new Kaart(kleurKaart,waardeKaart);
        }
    }
        System.out.println(Arrays.deepToString(deckOfCards));
    }
}
