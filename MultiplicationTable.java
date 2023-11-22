import java.util.Scanner;

public class MultiplicationTable {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number to create a multiplication table
        System.out.print("Enter an integer to generate its multiplication table: ");
        int num = scanner.nextInt();

        // Validate input to ensure num is an integer
        while (num <= 0) {
            System.out.println("Please enter a positive integer.");
            System.out.print("Enter an integer to generate its multiplication table: ");
            num = scanner.nextInt();
        }

        // Print the multiplication table using a for loop
        System.out.println("Multiplication table for " + num + ":");
        for (int i = 1; i <= 10; i++) {
            int product = num * i;
            System.out.println(num + " x " + i + " = " + product);
        }
    }
}
