package com.indira.basic.dsaproblems;

public class StringPalindromeChecker {
    public static void main(String[] args) {
        String input = "racecar";
        boolean isPalindrome = true;

        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            if (input.charAt(left) != input.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome) {
            System.out.println(input + " is a Palindrome.");
        } else {
            System.out.println(input + " is NOT a Palindrome.");
        }
    }
//    🔎 Sample Trace (for "racecar"):
//    	Left	Right	Chars	Match?
//    	0	6	r == r	✅
//    	1	5	a == a	✅
//    	2	4	c == c	✅
//    	3	3	e == e	✅
}
