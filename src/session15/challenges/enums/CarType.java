package session15.challenges.enums;

public enum CarType {

    SEDAN("Skoda", 20000),
    SUV("Toyota", 70000),
    SPORT("Ferrari", 200000);

    private String manufacturer;
    private int averagePrice;

    CarType(String manufacturer, int averagePrice) {
        this.manufacturer = manufacturer;
        this.averagePrice = averagePrice;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getAveragePrice() {
        return averagePrice;
    }

    @Override
    public String toString() {
        return "CarType{" +
                "manufacturer='" + manufacturer + '\'' +
                ", averagePrice=" + averagePrice +
                '}';
    }
}