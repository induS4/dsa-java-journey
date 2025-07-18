package com.indira.basic.dsaproblems;

import java.util.Scanner;

public class DSA1 {

	public static void printNumbers(int n) {
		for (int i = 0; i <= n; i++) {
			System.out.println(i + " ");
		}
	}

	public static boolean isPrimeOrNot(int n) {
		if (n == 1) {
			System.err.println("NOR PRIME NOR EVEN");
		}
		boolean isPrime = false;
		for (int i = 2; i <= n; i++) {
			if (n % i != 0) {
				// System.out.println("IS NOT A PRIME");
				isPrime = true;
				break;
			}
		}
		if (isPrime) {
			System.out.println("The given number" + n + "is a prime number");
		}
		return isPrime;

	}

	public static int reverseNum(int n) {
		/*
		 * 💭 Think Before You Code Let’s say n = 1234. We want to peel digits from the
		 * end like peeling layers off an onion 🧅
		 * 
		 * Step 1: lastDigit = n % 10 → 4
		 * 
		 * Step 2: reverse = reverse * 10 + lastDigit → 0 * 10 + 4 = 4
		 * 
		 * Step 3: Drop the last digit from n: n = n / 10 → 123 Repeat until n becomes
		 * 0.
		 */

		int lastDigit = 0;
		int reverse = 0;
		while (n > 0) {

			lastDigit = n % 10;
			reverse = reverse * 10 + lastDigit;
			n = n / 10;
		}
		return reverse;

	}

	public static void palindromeOrNot(int n) {

		int temp = n;
		int lastDigit = 0;
		int reverseNum = 0;

		while (n > 0) {
			lastDigit = n % 10;
			reverseNum = reverseNum * 10 + lastDigit;
			n = n / 10;

		}
		if (reverseNum == temp) {
			System.out.println(reverseNum + " Is Palindrome");
		} else {
			System.out.println(reverseNum + " Is Not a Palindrome");
		}
	}
	
	public static void sumOfDigits(int n) {
		int digit=0;
		int sum=0;
		while(n>0) {
			digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		System.out.println(sum);
		//return sum;
	}
	
	public static void printFibonacciSeries(int n) {
//		Example:
//			Input: n = 7
//			Output: 0 1 1 2 3 5 8
		int a=0;
		int b=1;
		for(int i=1;i<n;i++) {
			if(i==1) {
				 System.out.print(a + " " + b);	
				 }
			else {
				int next=a+b;
				a=b;
				b=next;
				System.out.print(next);
			}
			
		}
//		| i | a | b  | Print |
//		| - | - | -- | ----- |
//		| 1 | 0 | 1  | 0     |
//		| 2 | 1 | 1  | 1     |
//		| 3 | 1 | 2  | 1     |
//		| 4 | 2 | 3  | 2     |
//		| 5 | 3 | 5  | 3     |
//		| 6 | 5 | 8  | 5     |
//		| 7 | 8 | 13 | 8     |

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers");
		int n = sc.nextInt();
		printFibonacciSeries(n);
		//sumOfDigits(n); //n=1234
		//palindromeOrNot(n); //n=121
		// isPrimeOrNot(n);  /n=30
		// reverseNum(n); //1234
		// System.out.println(reverseNum(n) + "<=== Here is the number reversed");

		sc.close();
		// System.out.println("Hello World");
	}

}
