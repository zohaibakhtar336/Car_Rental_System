public class Car {
    private String carId;
    private String model;
    private double pricePerDay;
    private boolean isAvailable;

    public Car(String carId, String model, double pricePerDay) {
        this.carId = carId;
        this.model = model;
        this.pricePerDay = pricePerDay;
        this.isAvailable = true;
    }

    public String getCarId() {
        return carId;
    }

    public String getModel() {
        return model;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailability(boolean availability) {
        this.isAvailable = availability;
    }

    @Override
    public String toString() {
        return "Car ID: " + carId + ", Model: " + model + ", Price per day: $" + pricePerDay + ", Available: " + isAvailable;
    }
}
