package basics;
//Schrijf code waarmee je alle even getallen tussen 36 en 60 kan afdrukken. Maak hiervoor gebruik van een for loop.
public class even_oneven {

    public static void main(String[] args){
        int getal1 = 36;
        int getal2 = 60;

        for(int i = getal1; i<=getal2; i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }


}
