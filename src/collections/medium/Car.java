package collections.medium;

public class Car {

    private final long serialNumber;
    private final String fuelType;
    private int seats;
    public boolean rented;


    public long getSerialNumber() {
        return serialNumber;
    }

    public String getFuelType() {
        return fuelType;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public boolean isRented() {
        return rented;
    }

    public void setRented(boolean rented) {
        this.rented = rented;
    }

    public Car(long serialNumber, String fuelType, int seats, boolean rented) {
        this.serialNumber = serialNumber;
        this.fuelType = fuelType;
        this.seats = seats;
        this.rented = rented;
    }

    public Car(long serialNumber, String fuelType, int seats){
        this.serialNumber = serialNumber;
        this.fuelType = fuelType;
        this.seats = seats;
        this.rented = false;
    }

    public String carRented(){
        if (rented == true){
            return "Car is rented.";
        } else {
            return "Car is not rented";
        }
    }

    @Override
    public String toString(){
        return "Car serialnumber: " + serialNumber +"\nfuel type: " + fuelType + "\nnumber of seats: " + seats + "\nrented? " + carRented();
    }

}
