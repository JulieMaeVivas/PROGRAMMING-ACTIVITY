import java.util.Scanner;

public class PrimeNumberChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number to check for primality
        System.out.print("Enter a positive integer to check for primality: ");
        int num = scanner.nextInt();

        // Validate input to ensure num is a positive integer
        while (num <= 1) {
            System.out.println("Please enter a positive integer greater than 1.");
            System.out.print("Enter a positive integer to check for primality: ");
            num = scanner.nextInt();
        }

        // Call the isPrime method and print the result
        boolean isPrime = isPrimeNumber(num);
        if (isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }

    public static boolean isPrimeNumber(int num) {
        if (num <= 1) {
            return false;
        }

        // Use a do-while loop to check for divisibility
        int i = 2;
        do {
            if (num % i == 0) {
                // The number is divisible by i, so it's not a prime number
                return false;
            }
            i++;
        } while (i <= Math.sqrt(num));

        // If no divisors are found, the number is a prime number
        return true;
    }
}
