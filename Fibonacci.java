import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number of Fibonacci numbers to generate
        System.out.print("Enter the number of Fibonacci numbers to generate: ");
        int n = scanner.nextInt();

        // Validate input to ensure n is a positive integer
        while (n <= 0) {
            System.out.println("Please enter a positive integer.");
            System.out.print("Enter the number of Fibonacci numbers to generate: ");
            n = scanner.nextInt();
        }

        // Call the fibonacci method and print the result
        int[] result = generateFibonacci(n);
        System.out.print("Fibonacci sequence: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }

    public static int[] generateFibonacci(int n) {
        int[] fibSequence = new int[n];
        int a = 0, b = 1;

        int i = 0;
        while (i < n) {
            fibSequence[i] = a;
            int sum = a + b;
            a = b;
            b = sum;
            i++;
        }

        return fibSequence;
    }
}
