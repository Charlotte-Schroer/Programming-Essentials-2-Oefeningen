package inheritance;
import inheritance.Persoon;
import classes.Adres;
public class Persoontester {
    public static void main(String[] args) {
        Persoon persoon1 = new Persoon("Charlotte", "Demeester");
        persoon1.setAdres(new Adres("Kerkstraat", 1, 9000, "Gent"));
        persoon1.setEmail("charlotte.demeester@email.com");
        System.out.println(persoon1);

        Persoon persoon2 = new Persoon("Dirk", "De Witte");
        persoon2.setAdres(new Adres("Stenen Molen", 25, 'b', 9820, "Melsen"));
        persoon2.setEmail("Dirk@msn.be");
        System.out.println(persoon2);

        System.out.println(Persoon.getAantalPersonen());
    }
    }

