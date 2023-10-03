package session10.practice.car_dealership;

public class UsedCar extends Car {

    private int previousOwners;
    private int milage;

    public UsedCar(String model, int year, double price, int previousOwners, int milage) {
        super(model, year, price);
        this.previousOwners = previousOwners;
        this.milage = milage;
    }

    public int getPreviousOwners() {
        return previousOwners;
    }

    public int getMilage() {
        return milage;
    }
}

