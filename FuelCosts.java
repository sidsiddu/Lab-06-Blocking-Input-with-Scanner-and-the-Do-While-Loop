import java.util.Scanner;
public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons, efficiency, price;
        gallons = efficiency = price = 0;
        boolean done = false;
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Please enter a valid number.");
                in.nextLine();
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                efficiency = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Please enter a valid number.");
                in.nextLine();
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                price = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Please enter a valid number.");
                in.nextLine();
            }
        } while (!done);
        double costPer100Miles = (100/efficiency) * price;
        double distance = gallons * efficiency;
        System.out.println("The cost per 100 miles is: $" + costPer100Miles);
        System.out.println("The car can go: " + distance + " miles with the gas in the tank.");
    }
}
