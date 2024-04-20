package exceptions.easy;

public class KlantEnBoodschappenMandTEST {

    public static void main(String[] args) {
        Klant klant = new Klant("Jos");

        try {
            klant.toevoegenAanMandje(new Boek(123698,"Harry Potter"));
            klant.verwijderUitMandje(new Boek(25697, "Lord of the Rings"));
        } catch (BoekNietInMandjeException e){
            System.out.println(e.getMessage());
            System.out.println(klant);
        }
    }
}
