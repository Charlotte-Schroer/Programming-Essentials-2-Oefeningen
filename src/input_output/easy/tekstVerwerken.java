package input_output.easy;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tekstVerwerken {
    public static void main(String[] args) {

        try(BufferedReader input = new BufferedReader(new FileReader("test.csv"))){
            String currentLine;
            StringBuilder wholetext = new StringBuilder();

           while ((currentLine = input.readLine())!=null){
               wholetext.append(currentLine);
            String getal = wholetext.toString();
            String[] getallenAlsString = getal.split("\\s*,\\s*");
            Double[] getallen = new Double[getallenAlsString.length];

            for (int i = 0; i< getallenAlsString.length ; i++){
                getallen[i] = Double.parseDouble(getallenAlsString[i]);
            }

            double som = 0;

            for (int i = 0; i< getallen.length; i++){
                som+=getallen[i];
            }

            double gemiddelde = som/getallen.length;

            System.out.println(gemiddelde);

            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }

}