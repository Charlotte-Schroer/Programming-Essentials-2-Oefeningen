package classes;

public class Autotester {
    public static void main(String[] args){
        Auto auto1 = new Auto();
        System.out.println(auto1);
        auto1.fillTank();
        System.out.println(auto1);
        auto1.drive(100);
        System.out.println(auto1);
    }
}
