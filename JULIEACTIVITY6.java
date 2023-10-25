/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package julie.act;

/**
 *
 * @author Vivas_CPE
 */
public class JulieAct {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limit = 2000;
        long sum = 0;
        
        System.out.println("List of prime numbers below " + limit + ":");
        for (int i = 2; i < limit; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                sum += i;
            }
        }

        System.out.println("\n\nThe sum of all prime numbers below " + limit + " is: " + sum);
    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}
