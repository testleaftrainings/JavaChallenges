package javaChallenge;

//Given a string s consisting of lowercase English letters, return the first letter to appear twice.
//
//Note:
//
//A letter a appears twice before another letter b if the second occurrence of a is before the second occurrence of b.
//s will contain at least one letter that appears twice.
//
//Example 1:
//
//Input: s = "abccbaacz"
//Output: "c"
//Explanation:
//The letter 'a' appears on the indexes 0, 5 and 6.
//The letter 'b' appears on the indexes 1 and 4.
//The letter 'c' appears on the indexes 2, 3 and 7.
//The letter 'z' appears on the index 8.
//The letter 'c' is the first letter to appear twice, because out of all the letters the index of its second occurrence is the smallest.
//Example 2:
//
//Input: s = "abcdd"
//Output: "d"
//Explanation:
//The only letter that appears twice is 'd' so we return 'd'.
public class LetterAppearingTwice {
	public static void main(String[] args) {

		LetterAppearingTwice program = new LetterAppearingTwice();

		program.findLetters("abccbaacz");
		program.findLetters("abcdd");

	}

	public void findLetters(String string) {
		// Declare the count variable and initialize to zero
		char[] charArray = string.toCharArray();
		// Use nested loop to iterate through the char array
		for (int i = 1; i <= charArray.length - 1; i++) {
			// Declare the count variable and initialize to zero
			int count = 0;

			for (int j = 0; j <= charArray.length - 1; j++) {
				// Compare the current character with the previous and next characters
				if (charArray[i] == charArray[j] && charArray[j] == charArray[i - 1]) {
					// if condition satisfies, increase the count to 1
					count++;
				}
			}
			// If a character appears consecutively more than once, print it and break the
			// loop
			if (count > 1) {
				System.out.println("First letter to appear twice is===> " + charArray[i]);
				break;
			}
		}

	}

}