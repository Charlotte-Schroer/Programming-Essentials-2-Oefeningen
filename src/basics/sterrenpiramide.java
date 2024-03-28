package basics;

/*Maak een variabele hoogte, hiervoor gebruik je een klein geheel getal.
We gaan aan de hand van hoogte een sterrenpiramide bouwen. Per laag van de piramide komt er een ster bij. Dus bijvoorbeeld als hoogte gelijk is aan 4 zal de afgedrukte piramide er zo uit zien:

*
**
***
****
 */
public class sterrenpiramide {
    public static void main(String[] args){
     int hoogte = 5;
     String ster = "";
     for(int i = 0; i<hoogte; i++){
       ster += "*" ;
       System.out.println(ster);
     }

    }
}
