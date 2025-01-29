import java.util.ArrayList;

public class CarRentalSystem {
    private ArrayList<Car> cars;
    private ArrayList<Rental> rentals;

    public CarRentalSystem() {
        cars = new ArrayList<>();
        rentals = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void listAvailableCars() {
        boolean foundAvailable = false;
        for (Car car : cars) {
            if (car.isAvailable()) {
                System.out.println(car);
                foundAvailable = true;
            }
        }
        if (!foundAvailable) {
            System.out.println("No cars available at the moment.");
        }
    }

    public void rentCar(Customer customer, String carId, int rentalDays) {
        for (Car car : cars) {
            if (car.getCarId().equals(carId) && car.isAvailable()) {
                Rental rental = new Rental(customer, car, rentalDays);
                rentals.add(rental);
                car.setAvailability(false);
                System.out.println("Car rented successfully!");
                System.out.println(rental.getRentalDetails());
                return;
            }
        }
        System.out.println("Car not available or invalid Car ID.");
    }
}
