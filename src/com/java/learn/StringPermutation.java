package com.java.learn;

public class StringPermutation {

	private static void printStringPermutation(String lStr, String output) {
		if (lStr.length() == 0) {
			System.out.println(output);
		}
		for (int i = 0; i < lStr.length(); i++) {
			String lNewOutput = output.concat(lStr.substring(i, i + 1));
			String lNewStr = lStr.substring(0, i) + lStr.substring(i + 1);
			printStringPermutation(lNewStr, lNewOutput);
		}
	}

	public static void main(String[] args) {
		String input = "RAJESH";
		String output = "";
		printStringPermutation(input, output);
		System.out.println(output);
	}
}
