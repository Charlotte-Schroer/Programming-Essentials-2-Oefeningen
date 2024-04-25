package extra.oef2;

import java.util.Scanner;

public class PickAnyCardGame {

  private static Kaart pickAnyCard() {

      Waarde[] waardes = Waarde.values();
      Kleur[] kleuren = Kleur.values();
      Waarde waarde = waardes[(int)( Math.random() * waardes.length)];
      Kleur kleur = kleuren[(int) (Math.random() * kleuren.length)];
      return new Kaart(kleur, waarde);
  }

    public static void main(String[] args) {

      Scanner in = new Scanner(System.in);
      Kaart kaart = pickAnyCard();
      Kaart nieuweKaart;
      Boolean juistGeraden = true;
      int aantalKeerJuist = 0;

      while(juistGeraden && kaart!=null){
          nieuweKaart = pickAnyCard();

      System.out.println("Voorspel een hogere(h) of lagere(l) kaart die volgt: antwoord met \"h\" of \"l\".");
          String invoer = in.nextLine().trim().toLowerCase();



      if(kaart != null &&((invoer.equals("h") && nieuweKaart.hogerDan(kaart)) || ((invoer.equals("l")) && !nieuweKaart.hogerDan(kaart)))){
          System.out.println("Goed geraden! ");
          System.out.println("Eerste kaart was: " + kaart);
          System.out.println("Nieuwe kaart is: "+nieuweKaart);
          aantalKeerJuist++;
          kaart = nieuweKaart;
      } else {
          System.out.println("Helaas verkeerd, je hebt " + aantalKeerJuist + " juist geraden.");
          System.out.println("Eerste kaart was: "+kaart);
          System.out.println("Nieuwe kaart is: "+nieuweKaart);
          juistGeraden = false;
      }
      }
      in.close();
    }
}
