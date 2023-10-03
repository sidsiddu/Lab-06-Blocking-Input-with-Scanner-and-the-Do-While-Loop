import java.util.Scanner;
public class MetricConverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meters = 0;
        boolean done = false;
        do {
            System.out.print("Enter the measurement in meters: ");
            if (in.hasNextDouble()) {
                meters = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Please enter a valid number.");
                in.nextLine();
            }
        } while (!done);
        double miles = meters * 0.000621371;
        double feet = meters * 3.28084;
        double inches = meters * 39.3701;
        System.out.println(meters + " meters is equivalent to:");
        System.out.println(miles + " miles");
        System.out.println(feet + " feet");
        System.out.println(inches + " inches");
    }
}
