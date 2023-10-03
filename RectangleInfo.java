import java.util.Scanner;
public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width, height;
        width = height = 0;
        boolean done = false;
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Please enter a valid number.");
                in.nextLine();
            }
        } while (!done);
        done = false;
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine();
                done = true;
            } else {
                System.out.println("Please enter a valid number.");
                in.nextLine();
            }
        } while (!done);
        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal length: " + diagonal);
    }
}
