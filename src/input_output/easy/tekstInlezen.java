package input_output.easy;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tekstInlezen {

    public static void main(String[] args) {

        String invoer = " 8, 12, 15, 7, 6, 18, 12, 13, 7, 12, 14, 19";

        try(FileWriter output = new FileWriter("test.csv")) {
            output.write(invoer);
        } catch (IOException e){
            throw new RuntimeException(e);
        }

        try(FileReader input = new FileReader("test.csv")) {
            int readByte;
            StringBuilder text = new StringBuilder();

            while ((readByte = input.read()) != -1){
                text.append((char) readByte);
            }
            System.out.println(text);
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
