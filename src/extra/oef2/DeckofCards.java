package extra.oef2;

import java.util.Arrays;

public class DeckofCards {
    public static void main(String[] args) {

        Kaart[][] kaarten = new Kaart[4][13];

        for (Kleur kleur : Kleur.values()){
            for (Waarde waarde : Waarde.values()){
                int kleurIndex = kleur.ordinal();
                int waardeIndex = waarde.ordinal();
                kaarten[kleurIndex][waardeIndex] = new Kaart(kleur, waarde);
            }
        }
        System.out.println(Arrays.deepToString(kaarten));
    }
}
