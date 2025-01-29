import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CarRentalSystem system = new CarRentalSystem();

        // Adding cars to the system
        system.addCar(new Car("C1", "Toyota Camry", 50));
        system.addCar(new Car("C2", "Honda Civic", 40));
        system.addCar(new Car("C3", "Ford Mustang", 70));

        System.out.println("Welcome to the Car Rental System!");

        while (true) {
            System.out.println("\n1. List Available Cars");
            System.out.println("2. Rent a Car");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline character

            switch (choice) {
                case 1:
                    system.listAvailableCars();
                    break;
                case 2:
                    System.out.print("Enter customer name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter customer email: ");
                    String email = scanner.nextLine();
                    Customer customer = new Customer(name, email);
                    System.out.print("Enter car ID to rent: ");
                    String carId = scanner.nextLine();
                    System.out.print("Enter number of rental days: ");
                    int days = scanner.nextInt();
                    system.rentCar(customer, carId, days);
                    break;
                case 3:
                    System.out.println("Thank you for using the Car Rental System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }
}
