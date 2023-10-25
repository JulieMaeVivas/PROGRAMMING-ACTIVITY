/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julie.act.pkg8;

/**
 *
 * @author Vivas_CPE
 */
public class JulieAct8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limit = 10;
        long sum = 0;

        for (int number = 2; number < limit; number++) {
            if (isPrime(number)) {
                sum += number;
            }
        }

        System.out.println("The sum of prime numbers below " + limit + " is: " + sum);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
