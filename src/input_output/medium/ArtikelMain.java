package input_output.medium;


import java.io.*;
import java.time.LocalDate;

public class ArtikelMain {
    public static void main(String[] args) {

        Artikel artikel1 = new Artikel();
        artikel1.setPublicatiedatum(LocalDate.now());
        artikel1.setAuteur("Marc De Bel");
        artikel1.setTitel("Blinker en het bagbagjuweel");
        artikel1.setInhoud("blablabla");

        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("artikel.data"))) {
            output.writeObject(artikel1);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("artikel.data"))){
            Artikel readArtikel = (Artikel) input.readObject();
            System.out.println(readArtikel);
        } catch (IOException|ClassNotFoundException e ) {
            throw new RuntimeException(e);
        }
    }
}
