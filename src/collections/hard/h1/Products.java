package collections.hard.h1;

public class Products {

    private float price;
    private String brandname;
    private int modelnumber;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
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

    public Products(String brandname, int modelnumber, float price){
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