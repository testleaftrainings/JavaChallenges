package javaChallenge;

//Java Challenge (3/20)
//
//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//
//Given a string s, return true if it is a palindrome, or false otherwise.

//Example 1:
//
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.
//Example 2:
//
//Input: s = "race a car"
//Output: false
//Explanation: "raceacar" is not a palindrome.
//Example 3:
//
//Input: s = " "
//Output: true
//Explanation: s is an empty string "" after removing non-alphanumeric characters.
//Since an empty string reads the same forward and backward, it is a palindrome.
public class Palindrome {
	public void palindrome(String s) {
		System.out.println("Input String ====> " + s);
		// Replace special characters and spaces in the string with an empty string and store it in repString
		String repString = s.replaceAll("[^a-zA-Z0-9]", "");
		// Convert repString to lowercase and store it in lowerCaseString
		String lowerCaseString = repString.toLowerCase();
		// Convert lowerCaseString into a character array and store it in charArray
		char[] charArray = lowerCaseString.toCharArray();
		// Initialize an empty string revString
		String revString = "";
		// loop from the end of the charArray to the start:
		for (int i = charArray.length - 1; i >= 0; i--) {
			revString = revString + charArray[i];
		}

		// If lowerCaseString is equal to revString:
		if (lowerCaseString.equals(revString)) {
			// if matches print as true
			System.out.println("Output ==> " + true);
		} else
			// else print false
			System.out.println("Output ==> " + false);
	}

	public static void main(String[] args) {

		Palindrome string = new Palindrome();
		string.palindrome("A man, a plan, a canal: Panama");
		string.palindrome("race a car");
		string.palindrome(" ");

	}

}