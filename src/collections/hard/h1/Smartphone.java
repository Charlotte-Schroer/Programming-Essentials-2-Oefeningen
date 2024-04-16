package collections.hard.h1;

public class Smartphone extends Product{

    private final Screensize screenSmartphone;


    public Smartphone(String brandname, int modelnumber, int price, Screensize screenSmartphone) {
        super(brandname, modelnumber, price);
        this.screenSmartphone = screenSmartphone;
    }
}
