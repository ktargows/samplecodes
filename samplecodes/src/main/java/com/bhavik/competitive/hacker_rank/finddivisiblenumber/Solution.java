package com.bhavik.competitive.hacker_rank.finddivisiblenumber;

import java.util.Scanner;

/**
 * The Class Solution.
 * 
 * @author Bhavik Aniruddh Ambani
 */
public class Solution {

	/**
	 * The main method.
	 *
	 * @param args
	 *            the arguments
	 */
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int totalCases = scanner.nextInt();
		// System.out.println(totalCases);
		for (int i = 0; i < totalCases && scanner.hasNext(); i++) {
			System.out.println(getDevisibleNumbers(scanner.nextLong()));
		}
		scanner.close();
	}

	/**
	 * Gets the devisible numbers.
	 *
	 * @param numStr
	 *            the num str
	 * @return the devisible numbers
	 */
	public static int getDevisibleNumbers(long numStr) {
		int devisibleNumbers = 0;
		char[] numArray = String.valueOf(numStr).toCharArray();
		long numVal = Long.valueOf(numStr);
		for (int i = 0; i < numArray.length; i++) {
			// System.out.println(new Integer(numArray[i]) - 48);
			if (numArray[i] != '0' && !Double.isNaN(numArray[i])) {
				if ((numVal % (new Integer(numArray[i]) - 48)) == 0) {
					devisibleNumbers++;
				}
			}
		}
		return devisibleNumbers;
	}
}
