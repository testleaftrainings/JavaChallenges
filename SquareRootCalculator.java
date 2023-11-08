package javaChallenge;
//Java Challenge (1/20)
//
//Given a non-negative integer x, compute and return the square root of x.
//
//Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.
//
//Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
//
// 
//
//Example 1:
//
//Input: x = 4
//Output: 2
//Example 2:
//
//Input: x = 8
//Output: 2
//Explanation: The square root of 8 is 2.82842..., and since the decimal part is truncated, 2 is returned.
public class SquareRootCalculator {

	public int calculateSquareRoot(int number) {
		// Initialize y to half the given number
		double y = number / 2.0;
		// Temporary variable to hold the initial value of y
		double temp = y;
		// Loop to iterate until the approximation converges
		while ((temp - y) != 0) {
			// Store the current value of y in temp
			temp = y;
			// Update y using the formula
			y = ((number / temp) + temp) / 2;
		}
		// Convert the calculated square root to an integer
		int square = (int) y;
		// Return the calculated square root
		return square;
	}

	// Main method to test the square root calculation
	public static void main(String[] args) {
		SquareRootCalculator root = new SquareRootCalculator(); 
		System.out.println("===========================================");
		System.out.println("Square Root Value of the given number is");
		System.out.println("===========================================");
		System.out.println(root.calculateSquareRoot(4));
		System.out.println(root.calculateSquareRoot(8));
	}
}
