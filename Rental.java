public class Rental {
    private Customer customer;
    private Car car;
    private int rentalDays;

    public Rental(Customer customer, Car car, int rentalDays) {
        this.customer = customer;
        this.car = car;
        this.rentalDays = rentalDays;
    }

    public double calculateRentalPrice() {
        return car.getPricePerDay() * rentalDays;
    }

    public String getRentalDetails() {
        return customer + ", Car: " + car + ", Days: " + rentalDays + ", Total Price: $" + calculateRentalPrice();
    }
}
