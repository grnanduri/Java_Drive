package com.java.learn;

public class PalindromeCheck {

	
	public static void main(String args[]) {

		isPalindrome("abcbabcba");

	}

	private static boolean isPalindrome(String s) {
		
		int i = s.length()-1;
		int j = 0;
		
		while (i>j) {
			
			if (s.charAt(i)!=s.charAt(j)) {
				System.out.println("Its not a palindrome");
				return false;
			}
			++j;
			--i;
		}
		System.out.println("Its a palindrome");
		return true;
	}
}
