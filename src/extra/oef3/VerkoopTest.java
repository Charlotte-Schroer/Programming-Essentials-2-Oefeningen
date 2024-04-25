package extra.oef3;

import java.util.TreeMap;

public class VerkoopTest {
    public static void main(String[] args) {

        ProductManager verkoop = new ProductManager();
        Smartwatch w1 = new Smartwatch("Samsung", "galaxy-96354", ScreenSmartWatch.SQUARED, 35199);
        Smartwatch w2 = new Smartwatch("Apple", "iwatch458", ScreenSmartWatch.ROUND, 25199);
        Smartwatch w3 = new Smartwatch("LG", "Gplus12", ScreenSmartWatch.SQUARED, 15199);;
        Smartphone p1 = new Smartphone("Samsung", "S24", 490, 310, 59999);
        Smartphone p2 = new Smartphone("OnePlus", "CE-North", 890, 710, 99999);
        Smartphone p3 = new Smartphone("Apple", "iphone13", 690, 510, 79999);

        verkoop.addSmartwatch(w1);
        verkoop.addSmartwatch(w2);
        verkoop.addSmartwatch(w3);
        verkoop.addSmartphone(p1);
        verkoop.addSmartphone(p2);
        verkoop.addSmartphone(p3);

        System.out.println(verkoop);
        verkoop.sortByName();
        System.out.println(verkoop);
        verkoop.sortByPrice();
        System.out.println(verkoop);
    }
}
