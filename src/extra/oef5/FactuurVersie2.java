package extra.oef5;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class FactuurVersie2 implements Serializable {

    private Date factuurdatum;
    private Collection<Product> producten;

    public FactuurVersie2() {
        this.factuurdatum = new Date();
        this.producten = new ArrayList<>();
    }

    public void setFactuurdatum(Date factuurdatum){
        this.factuurdatum = factuurdatum;
    }

    public void addProducten(Product product){
        producten.add(product);
    }

    public void genereerFactuur(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String bestandsnaam = dateFormat.format(factuurdatum)+".txt";
        int totaalprijs = 0;
        for(Product product : producten){
            totaalprijs+=product.getPrijs();
        }
        String gegenereerdeFactuur="Factuur op: " +dateFormat.format(factuurdatum) + "\nProducten:\n"+ producten +"\nTotaalprijs: €" + (double)totaalprijs/100;
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(bestandsnaam))) {
            output.writeObject(gegenereerdeFactuur);
            System.out.println("Factuur weggeschreven naar " + bestandsnaam);
        }catch (IOException e){
            throw new RuntimeException(e);
        }
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(bestandsnaam))){
            String readFactuur = (String) inputStream.readObject();
            System.out.println(readFactuur);
        } catch (IOException |ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Wasverzachter", 826);
        Product p2 = new Product("Waspoder", 982);
        Product p3 = new Product("Spons", 199);
        FactuurVersie2 factuur = new FactuurVersie2();
        factuur.addProducten(p1);
        factuur.addProducten(p2);
        factuur.addProducten(p3);
        factuur.genereerFactuur();
    }
}
