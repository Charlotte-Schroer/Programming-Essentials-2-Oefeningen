package collections.medium;

import java.util.TreeMap;

public class Fleet {

    public static void main(String[] args) {

        TreeMap <String,Car> fleet = new TreeMap<>();

        String licensePlate1 = "1NBT563";
        String licensePlate2 = "2BFE963";
        String licensePlate3 = "2XRS563";

        Car opel1 = new Car(123697125, "LPG", 5, true);
        Car opel2 = new Car(4598774, "D7", 6);
        Car vw1 = new Car(469826, "Petrol", 5, true);

        fleet.put(licensePlate1, opel1);
        fleet.put(licensePlate2, opel2);
        fleet.put(licensePlate3, vw1);

        System.out.println(fleet);
    }
}
