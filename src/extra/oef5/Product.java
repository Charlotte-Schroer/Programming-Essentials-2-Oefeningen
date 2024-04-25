package extra.oef5;

public class Product {

    private String naam;
    private int prijs;

    public Product(String naam, int prijs) {
        this.naam = naam;
        this.prijs = prijs;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getPrijs() {
        return prijs;
    }

    public void setPrijs(int prijs) {
        this.prijs = prijs;
    }

    @Override
    public String toString() {
        return "Product:" + naam + "- €" + (double)prijs/100;
    }
}
