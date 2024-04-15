package collections.hard.h1;

public class Smartwatches extends Products{

    private final ScreenSmartwatches screenSmartwatch;

    public ScreenSmartwatches getScreenSmartwatch() {
        return screenSmartwatch;
    }

    public Smartwatches(String brandname, int modelnumber, int price, ScreenSmartwatches screenSmartwatch) {
        super(brandname, modelnumber, price);
        this.screenSmartwatch = screenSmartwatch;
    }
}
