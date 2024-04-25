package extra.oef5;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class Factuur {

    private Date factuurdatum;
    private Collection<Product> producten;

    public Factuur() {
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
        try(Writer writer = new BufferedWriter(new FileWriter(bestandsnaam))){
            writer.write("Factuurdatum: " + factuurdatum.toString());
            writer.write("Producten: " + producten);
            int totaalprijs = 0;
            for (Product product : producten){
                totaalprijs+=product.getPrijs();
            }
            writer.write("Totaalprijs: €" + (double)totaalprijs/100);
            System.out.println("Factuur gegenereert en weggeschreven.");
        } catch (IOException e){
            System.out.println("Er is een fout opgetreden tijdens het wegschrijven van de factuur");
        }
        try (BufferedReader input = new BufferedReader(new FileReader(bestandsnaam))){
            String currentLine;
            StringBuilder wholeText = new StringBuilder();
            while ((currentLine = input.readLine())!=null){
                wholeText.append(currentLine);
            }
            System.out.println(wholeText);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        Product p1 = new Product("Wasverzachter", 826);
        Product p2 = new Product("Waspoder", 982);
        Product p3 = new Product("Spons", 199);
        Factuur factuur = new Factuur();
        factuur.addProducten(p1);
        factuur.addProducten(p2);
        factuur.addProducten(p3);
        factuur.genereerFactuur();
    }
}
