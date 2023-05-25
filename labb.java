import java.util.Scanner;

public class labb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String restaurantName = "Brampton Hamburgers";
        System.out.println("Welcome to " + restaurantName + "\n");

        String[] menuItems = {
                "Veggie Burger",
                "Deluxe Veggie Burger",import java.util.Scanner;

public class RestaurantOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String restaurantName = "Brampton Hamburgers";
        System.out.println("Welcome to " + restaurantName + "\n");

        String[] menuItems = {
                "Veggie Burger",
                "Deluxe Veggie Burger",
                "Chicken Burger",
                "Cheese Chicken Burger",
                "Cheese Bacon Burger",
                "Deluxe Bacon Burger",
                "Healthy Organic Burger",
                "Quit"
        };

        double[] menuPrices = {
                5.95,
                7.95,
                6.45,
                8.50,
                9.25,
                10.95,
                12.45,
                0.00
        };

        int totalCustomers = 5;
        double totalBillingAmount = 0.0;

        for (int customer = 1; customer <= totalCustomers; customer++) {
            System.out.println("Customer " + customer + " Order:\n");

            int choice;
            double quantity;
            double subtotal = 0.0;

            do {
                System.out.println("Menu:\n");
                System.out.println("Type of Burger\tPrice");
                for (int i = 0; i < menuItems.length; i++) {
                    System.out.println((i + 1) + ". " + menuItems[i] + "\t$" + menuPrices[i]);
                }
                System.out.println();

                System.out.print("Enter your choice (1-8): ");
                choice = scanner.nextInt();

                if (choice < 1 || choice > 8) {
                    throw new IllegalArgumentException("Invalid choice. Please select an option from 1 to 8.");
                }

                if (choice == 8) {
                    break;
                }

                System.out.print("Enter the quantity: ");
                quantity = scanner.nextDouble();

                subtotal += menuPrices[choice - 1] * quantity;

            } while (choice != 8);

            double totalAmount = subtotal * 1.13; // Adding 13% tax

            if (totalAmount > 50) {
                totalAmount *= 0.95; // Applying 5% discount
            }

            if (totalAmount > 100) {
                totalAmount *= 0.90; // Applying 10% discount
            }

            totalBillingAmount += totalAmount;

            System.out.println("\nCustomer " + customer + " Total Billing Amount: $" + totalAmount + "\n");
        }

        System.out.println("Total Billing Amount for all customers: $" + totalBillingAmount);
    }
}

                "Chicken Burger",
                "Cheese Chicken Burger",
                "Cheese Bacon Burger",
                "Deluxe Bacon Burger",
                "Healthy Organic Burger",
                "Quit"
        };

        double[] menuPrices = {
                5.95,
                7.95,
                6.45,
                8.50,
                9.25,
                10.95,
                12.45,
                0.00
        };

        int totalCustomers = 5;
        double totalBillingAmount = 0.0;

        for (int customer = 1; customer <= totalCustomers; customer++) {
            System.out.println("Customer " + customer + " Order:\n");

            int choice;
            double quantity;
            double subtotal = 0.0;

            do {
                System.out.println("Menu:\n");
                System.out.println("Type of Burger\tPrice");
                for (int i = 0; i < menuItems.length; i++) {
                    System.out.println((i + 1) + ". " + menuItems[i] + "\t$" + menuPrices[i]);
                }
                System.out.println();

                System.out.print("Enter your choice (1-8): ");
                choice = scanner.nextInt();

                if (choice < 1 || choice > 8) {
                    throw new IllegalArgumentException("Invalid choice. Please select an option from 1 to 8.");
                }

                if (choice == 8) {
                    break;
                }

                System.out.print("Enter the quantity: ");
                quantity = scanner.nextDouble();

                subtotal += menuPrices[choice - 1] * quantity;

            } while (choice != 8);

            double totalAmount = subtotal * 1.13; // Adding 13% tax

            if (totalAmount > 50) {
                totalAmount *= 0.95; // Applying 5% discount
            }

            if (totalAmount > 100) {
                totalAmount *= 0.90; // Applying 10% discount
            }

            totalBillingAmount += totalAmount;

            System.out.println("\nCustomer " + customer + " Total Billing Amount: $" + totalAmount + "\n");
        }

        System.out.println("Total Billing Amount for all customers: $" + totalBillingAmount);
    }
}
