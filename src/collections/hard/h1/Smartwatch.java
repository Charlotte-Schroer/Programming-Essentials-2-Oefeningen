package collections.hard.h1;

public class Smartwatch extends Product{

    private final ScreenSmartwatch screenSmartwatch;

    public ScreenSmartwatch getScreenSmartwatch() {
        return screenSmartwatch;
    }

    public Smartwatch(String brandname, int modelnumber, int price, ScreenSmartwatch screenSmartwatch) {
        super(brandname, modelnumber, price);
        this.screenSmartwatch = screenSmartwatch;
    }
}
