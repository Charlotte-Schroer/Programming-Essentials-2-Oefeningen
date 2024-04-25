package extra.oef3;

public class Smartphone extends Product {

    private  int height;
    private int width;
    private final ScreenSmartphone screen;

    public Smartphone(String merknaam, String modelnaam, int height, int width, int prijs){
        super(merknaam, modelnaam, prijs);
        this.height = height;
        this.width = width;
        if(height>980&&width>720){
            screen=ScreenSmartphone.XLarge;
        }else if((height<=980 && width<=720) && (height>640 && width>480)){
            screen=ScreenSmartphone.Large;
        }else if((height<=640 && width<=480) && (height>470 && width>320)){
            screen=ScreenSmartphone.Normal;
        }else {
            screen=ScreenSmartphone.Small;
        }
    }

    public ScreenSmartphone getScreen() {
        return screen;
    }

    @Override
     public String toString(){
        return  "Smartphone: " +
                "\nMerknaam: '" + getMerknaam() + '\'' +
                "\nModelnummer: '" + getModelnummer() + '\'' +
                "\nSchermresulutie: " + height + "dpx" + width + "dp" +
                    " = " + screen +
                "\nPrijs: €" +(double)getPrijs()/100;
    }
}
