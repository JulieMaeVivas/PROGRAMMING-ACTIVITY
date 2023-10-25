/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication7;

/**
 *
 * @author Vivas_CPE
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long limit = 2000000;
        long sum = sumOfPrimesBelowLimit(limit);
        System.out.println("The sum of all prime numbers below " + limit + " is: " + sum);
    }

    public static long sumOfPrimesBelowLimit(long limit) {
        boolean[] isPrime = new boolean[(int) limit];
        for (int i = 2; i < limit; i++) {
            isPrime[i] = true;
        }

        for (int p = 2; p * p < limit; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < limit; i += p) {
                    isPrime[i] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 2; i < limit; i++) {
            if (isPrime[i]) {
                sum += i;
            }
        }

        return sum;
    }
}
    
