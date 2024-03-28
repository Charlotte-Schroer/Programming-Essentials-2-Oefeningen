package basics;
//Zoek de grootste gemene deler van deze twee getallen.
public class grootste_gemene_deler {

    public static int gcd(int a, int b){
        //algoritme van Euclides
        if( b>a){
           int temp = b;
           b = a;
           a = temp;
        }
        int rest = a%b;
        while ( rest != 0 ){
            a = b;
            b = rest;
            rest = a%b;
        }
        return b;
    }

    public static void main(String[] args){
        System.out.println(gcd(20, 10));
    }
}
