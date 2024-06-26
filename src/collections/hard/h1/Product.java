package collections.hard.h1;

public class Product {

    private int price; // price in cents
    private String brandname;
    private int modelnumber;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrandname() {
        return brandname;
    }

    public void setBrandname(String brandname) {
        this.brandname = brandname;
    }

    public int getModelnumber() {
        return modelnumber;
    }

    public void setModelnumber(int modelnumber) {
        this.modelnumber = modelnumber;
    }

    public Product(String brandname, int modelnumber, int price){
        this.brandname = brandname;
        this.modelnumber = modelnumber;
        this.price = price;
    }

    @Override
    public String toString(){
        return "Brandname: " + brandname +
                "Modelnumber: " + modelnumber +
                "Price: " + price;
    }
}
