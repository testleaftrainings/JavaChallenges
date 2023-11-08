package javaChallenge;

import java.util.ArrayList;
import java.util.List;


//Java Problem: 17/20
//Given a string array words, 
//return an array of all characters that show up in all strings within the words (including duplicates). 
//You may return the answer in any order.
//		 
//Example 1:
//
//Input: words = ["bella","label","roller"]
//Output: ["e","l","l"]
//Example 2:
//
//Input: words = ["cool","lock","cook"]
//Output: ["c","o"]

public class StringArrayOfWords {

	public static List<String> commonChars(String[] words) {
		// create a empty list to store the result
		ArrayList<String> list = new ArrayList<String>();
		// Use for loop to iterate through each character of the first word in array
		for (int k = 0; k < words[0].length(); k++) {
			// initialize the counter variable as 1
			int count = 1;
			// Use nested for loop to compare the characters of first word with other words of array
			for (int i = 1; i < words.length; i++) { // first word
				for (int j = 0; j < words[i].length(); j++) {// for following elements in array
					// Compare the characters of first word with characters of second word in array
					if (words[0].charAt(k) == words[i].charAt(j)) {
						// if matches increase the count to 1
						count++;
						// store the common character in word[i]
						words[i] = words[i].substring(0, j) + "" + words[i].substring(j + 1);
						break;
					}
				}
			}
			// if count is equal to word length
			if (count == words.length) {
				// add the characters to list
				list.add(words[0].charAt(k) + "");
			}		}
		return list;
	}
	public static void main(String[] args) {
		String[] words = { "bella", "label", "roller" };
		List<String> commonChars = commonChars(words);
		System.out.println(commonChars);

	}
}
