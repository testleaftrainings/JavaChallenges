package javaChallenge;

//Given two string arrays word1 and word2, return true if the two arrays represent the same string, and false otherwise.
//
//A string is represented by an array if the array elements concatenated in order forms the string.
//
//Example 1:
//
//Input: word1 = ["ab", "c"], word2 = ["a", "bc"]
//Output: true
//Explanation:
//word1 represents string "ab" + "c" -> "abc"
//word2 represents string "a" + "bc" -> "abc"
//The strings are the same, so return true.
//Example 2:
//
//Input: word1 = ["a", "cb"], word2 = ["ab", "c"]
//Output: false
//Example 3:
//
//Input: word1  = ["abc", "d", "defg"], word2 = ["abcddefg"]
//Output: true

public class ComparingTheString {

	public static void main(String[] args) {
		String[] words1 = { "ab", "c" };
		String[] words2 = { "a", "bc" };

		String[] words3 = { "a", "cb" };
		String[] words4 = { "ab", "c" };

		String[] words5 = { "abc", "d", "defg" };
		String[] words6 = { "abcddefg" };

		ComparingTheString stringComparison = new ComparingTheString();

		stringComparison.compareConcatenatedString(words1, words2);

		stringComparison.compareConcatenatedString(words3, words4);

		stringComparison.compareConcatenatedString(words5, words6);
	}

	public void compareConcatenatedString(String[] words1, String[] words2) {
		// Initialize concatenatedString1 and concatenatedString2 to empty strings
		String concatenatedString1 = "";
		String concatenatedString2 = "";
		// Loop through each word in 'words1' array and concatenate them to
		// 'concatenatedString1'
		for (int i = 0; i < words1.length; i++) {
			concatenatedString1 = concatenatedString1 + words1[i];
		}
		// Loop through each word in 'words2' array and concatenate them to
		// 'concatenatedString2'

		for (int i = 0; i < words2.length; i++) {

			concatenatedString2 = concatenatedString2 + words2[i];
		}
		// If 'concatenatedString1' is equal to 'concatenatedString2'

		if (concatenatedString1.equals(concatenatedString2)) {
			// Print "true"
			System.out.println(true);
		} else {
			//Print "false"			
			System.out.println(false);
		}
	}
}
