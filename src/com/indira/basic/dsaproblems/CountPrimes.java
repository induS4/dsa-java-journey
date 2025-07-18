package com.indira.basic.dsaproblems;

import java.util.*;

public class CountPrimes {
    public static int countPrimesUpToN(int n) {
        if (n < 2) return 0;

        boolean[] isPrime = new boolean[n + 1];
        Arrays.fill(isPrime, true); // Assume everyone is a prime

        isPrime[0] = false;
        isPrime[1] = false;

        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                // Cross out all multiples of i
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number N: ");
        int n = sc.nextInt();

        int result = countPrimesUpToN(n);
        System.out.println("Number of primes up to " + n + ": " + result);
    }
}
