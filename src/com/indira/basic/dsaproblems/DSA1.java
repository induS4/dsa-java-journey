package com.indira.basic.dsaproblems;

import java.util.Scanner;

public class DSA1 {
	
	public static void printNumbers(int n) {
		for(int i=0;i<=n;i++) {
			System.out.println(i + " ");
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter numbers");
		int n=sc.nextInt();
		printNumbers(n);

		 sc.close();
		System.out.println("Hello World");
	}

}
