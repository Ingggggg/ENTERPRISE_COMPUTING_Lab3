/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jmsprimeserver;

/**
 *
 * @author kisar
 */
public class PrimeCounter {
    public static int numPrimes(int min, int max) {
        int  count = 0;
        for (int i = min; i < max; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }
    private static boolean isPrime(int n) {
         int i;
         for (i = 2; i*i <= n; i++) {
            if ((n % i) == 0) {
               return false;
            }   
         }
         return true;
     }
}