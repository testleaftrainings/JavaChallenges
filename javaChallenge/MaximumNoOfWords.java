package javaChallenge;
//Java Problem (13/20)

//
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
//
//You are given an array of strings sentences, where each sentences[i] represents a single sentence.
//
//Return the maximum number of words that appear in a single sentence.
//
//
//
//Example 1:
//
//Input: sentences = ["alice and bob love java", "i think so too", "this is great thanks very much"]
//Output: 6
//Explanation: 
//- The first sentence, "alice and bob love java", has 5 words in total.
//- The second sentence, "i think so too", has 4 words in total.
//- The third sentence, "this is great thanks very much", has 6 words in total.
//Thus, the maximum number of words in a single sentence comes from the third sentence, which has 6 words.
//Example 2:
//
//Input: sentences = ["please wait", "continue to fight", "continue to win"]
//Output: 3
//Explanation: It is possible that multiple sentences contain the same number of words. 
//In this example, the second and third sentences (underlined) have the same number of words.

import java.util.Arrays;

public class MaximumNoOfWords {

	public static void main(String[] args) {
		// Create an instance of the class
		MaximumNoOfWords find = new MaximumNoOfWords();

		// Sample input arrays of strings
		String[] input = { "alice and bob love java", "i think so too", "this is great thanks very much" };
		String[] input1 = { "please wait", "continue to fight", "continue to win" };

		// Call the findMaxmimumWord method for each input array
		find.findMaxmimumWord(input);
		find.findMaxmimumWord(input1);

	}

	public void findMaxmimumWord(String[] string) {
		System.out.println("String Array");
		System.out.println(Arrays.toString(string));
		// Create an array to store the maximum number of words for each string
		int[] max = new int[string.length];
		// Iterate through the input string array
		for (int i = 0; i <= string.length - 1; i++) {
			// Remove leading and trailing spaces from the string
			String trim = string[i].trim();
			// Split the string into words using space as the delimiter
			String[] split= trim.split(" ");
			// Store the number of words in the current string in the 'max' array
			max[i] = split.length;

		}
		// Initialize a variable to store the maximum number of words
		int max_value = 0;
		// Iterate through the 'max' array to find the maximum value using nested for loop
		for (int i = 0; i <= string.length - 1; i++) {
			for (int j = 0; j <= string.length - 1; j++) {
				// Compare the number of words in different strings
				if (max[i] > max[j]) {
					// Update the 'max_value' if a greater value is found
					max_value = max[i];
				}
			}

		}
		// Print the maximum number of words in a sentence
		System.out.println("Maximun words in sentence");
		System.out.println(max_value);
	}

}
