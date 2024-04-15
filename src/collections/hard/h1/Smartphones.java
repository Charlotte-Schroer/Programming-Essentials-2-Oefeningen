package collections.hard.h1;

public class Smartphones extends Products{

    private final ScreenSmartphones screenSmartphones;

    public ScreenSmartphones getScreenSmartphones() {
        return screenSmartphones;
    }

    public Smartphones(String brandname, int modelnumber, float price, ScreenSmartphones screenSmartphones) {
        super(brandname, modelnumber, price);
        this.screenSmartphones = screenSmartphones;
    }
}
