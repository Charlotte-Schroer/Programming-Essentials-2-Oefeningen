package input_output.hard;

import javax.imageio.IIOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;

public class Factuur {

    private Date factuurdatum;
    private Collection<Product> producten;

    public Factuur() {
        this.factuurdatum = new Date();
        this.producten = new ArrayList<>();
    }

    public void addProducten(Product product){
        producten.add(product);
    }

    public void geneerFactuur(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd_HHmmss");
        String bestandsnaam = "factuur_"+ dateFormat.format(factuurdatum)+".txt";
        try (Writer writer = new BufferedWriter(new FileWriter(bestandsnaam))){
            int totaalprijs = 0;

            writer.write("Factuurdatum: " + factuurdatum.toString() +"\n");
            writer.write("Producten:\n");
            for (Product product : producten){
                writer.write(product.getNaam() + " + - €" + (double)product.getPrijs()/100);
                totaalprijs += product.getPrijs();
            }
            writer.write("\nTotaalprijs: €" + (double)totaalprijs/100);
            System.out.println("Factuur op:" + factuurdatum + "\nProducten: " + producten + "\nTotaalprijs: €" + (double)totaalprijs/100 + "\nWeggeschreven aar bestand: " + bestandsnaam);
        } catch (IOException e){
            System.out.println("Er is een fout opgetreden bij het wegschrijven van de factuur.");
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
        factuur.geneerFactuur();
    }
}
