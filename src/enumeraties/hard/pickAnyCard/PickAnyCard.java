package enumeraties.hard.pickAnyCard;

import enumeraties.medium.deckOfCards.Kaart;
import enumeraties.medium.deckOfCards.KleurKaart;
import enumeraties.medium.deckOfCards.WaardeKaart;

import java.util.Scanner;

public class PickAnyCard {

    private static Kaart genereerEenKaart() {
        WaardeKaart[] waarden = WaardeKaart.values();
        KleurKaart[] kleuren = KleurKaart.values();
        WaardeKaart willekeurigeWaarde = waarden[(int)(Math.random()* waarden.length)];
        KleurKaart willekeurigeKleur = kleuren[(int)(Math.random()* kleuren.length)];
        return new Kaart(willekeurigeKleur, willekeurigeWaarde);
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Kaart kaart = null;
        Kaart nieweKaart;
        boolean juisteGok = true;

        while (juisteGok){
            nieweKaart = genereerEenKaart();
            if(kaart != null) {
                System.out.println("Kaart: " + kaart);
            }

            System.out.println("Voorspel of de volgende kaart hoger (h) of lager(l) zal zijn? ");
            String invoer = in.nextLine().trim().toLowerCase();

            kaart = nieweKaart;

            if(kaart != null && ((invoer.equals("h") && nieweKaart.isHogerdan(kaart)) || (invoer.equals("l") && !nieweKaart.isHogerdan(kaart)))){
                System.out.println("Goed geraden! De volgende kaart was inderdaad hoger of lager");
            } else {
                System.out.println("Helaas vekeerd");
                juisteGok = false;
            }
        }
        in.close();

    }
}