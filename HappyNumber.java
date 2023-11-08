package javaChallenge;

import java.util.LinkedHashSet;
import java.util.Set;

//Java Challenge (5/20)
//
//Write an algorithm to determine if a number n is happy.
//
//A happy number is a number defined by the following process:
//
//Starting with any positive integer, replace the number by the sum of the squares of its digits.
//Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.
//Those numbers for which this process ends in 1 are happy.
//Return true if n is a happy number, and false if not.
//
//
//
//Example 1:
//
//Input: n = 19
//Output: true
//Explanation:
//12 + 92 = 82
//82 + 22 = 68
//62 + 82 = 100
//12 + 02 + 02 = 1
//Example 2:
//
//Input: n = 2
//Output: false
public class HappyNumber {

	public static int findHappyNumber(int num) {
		int rem = 0, sum = 0;

		// Calculates the sum of squares of digits
		while (num > 0) {
			rem = num % 10;
			sum = sum + (rem * rem);
			num = num / 10;
		}
		return sum;
	}

	public static void main(String[] args) {
		int num = 74;
		int result = num;

		//Check for the given number is not equal to 1 and 4 then call the method
		while (result != 1 && result != 4) {
			result = findHappyNumber(result);
		}
		// Happy number always ends with 1
		if (result == 1) {
			System.out.println(num + " is a happy number");
		}
		// Unhappy number ends in a cycle of repeating numbers which contains 4
		else if (result == 4) {
			System.out.println(num + " is not a happy number");
		}
	}

}