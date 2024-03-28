package classes;

public class CirkelTester {
    public static void main(String[] args){
        Cirkel cirkel1 = new Cirkel(5.0, "rood");
        Cirkel cirkel2 = new Cirkel(1.0);
        Cirkel cirkel3 = new Cirkel("groen");
        System.out.println(cirkel1);
        System.out.println(cirkel2);
        System.out.println(cirkel3);
        System.out.println(cirkel1.geefOmtrek());
        System.out.println(cirkel2.geefOmtrek());
    }
}
