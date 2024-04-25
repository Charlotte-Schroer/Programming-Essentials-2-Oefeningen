package extra.oef3;

public class Product {
    private int prijs; //prijs in cent
    private String merknaam;
    private String modelnummer; //kunnen letters inzitten

    public Product(String merknaam, String modelnummer, int prijs) {
        this.merknaam = merknaam;
        this.modelnummer = modelnummer;
        this.prijs = prijs;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    public String getMerknaam() {
        return merknaam;
    }

    public void setMerknaam(String merknaam) {
        this.merknaam = merknaam;
    }

    public String getModelnummer() {
        return modelnummer;
    }

    public void setModelnummer(String modelnummer) {
        this.modelnummer = modelnummer;
    }

    @Override
    public String toString() {
        return "Product: " +
                "\nMerknaam: '" + merknaam + '\'' +
                "\nModelnummer: '" + modelnummer + '\'' +
                "\nPrijs: €" +(double)prijs/100;
    }
}
