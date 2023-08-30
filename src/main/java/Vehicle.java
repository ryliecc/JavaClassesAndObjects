public class Vehicle {
    String manufacturer;
    String model;
    int yearOfManufacture;

    Vehicle(String manufacturer, String model, int yearOfManufacture){
        this.manufacturer = manufacturer;
        this.model = model;
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
