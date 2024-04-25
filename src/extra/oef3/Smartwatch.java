package extra.oef3;

public class Smartwatch extends Product{

    private ScreenSmartWatch screen;
    public Smartwatch(String merknaam, String modelnummer, ScreenSmartWatch screen ,int prijs) {
        super(merknaam, modelnummer, prijs);
        this.screen = screen;
    }

    public ScreenSmartWatch getScreen() {
        return screen;
    }

    public void setScreen(ScreenSmartWatch screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        return  "Smartwatch: " +
                "\nScreen: " + screen +
                "\nMerknaam: '" + getMerknaam() + '\'' +
                "\nModelnummer: '" + getModelnummer() + '\'' +
                "\nPrijs: €" +(double)getPrijs()/100;
    }
}
