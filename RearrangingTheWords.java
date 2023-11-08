package javaChallenge;

import java.util.Arrays;

//Java Problem (14/20)
//
//A sentence is a list of words that are separated by a single space with no leading or trailing spaces. Each word consists of lowercase and uppercase English letters.
//
//A sentence can be shuffled by appending the 1-indexed word position to each word then rearranging the words in the sentence.
//
//For example, the sentence "This is a sentence" can be shuffled as "sentence4 a3 is2 This1" or "is2 sentence4 This1 a3".
//Given a shuffled sentence s containing no more than 9 words, reconstruct and return the original sentence.
//
//Example 1:
//
//Input: s = "is2 sentence4 This1 a3"
//Output: "This is a sentence"
//Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
//Example 2:
//
//Input: s = "Myself2 Me1 I4 and3"
//Output: "Me Myself and I"
//Explanation: Sort the words in s to their original positions "Me1 Myself2 and3 I4", then remove the numbers.

public class RearrangingTheWords {
	public static void main(String[] args) {
		RearrangingTheWords rearrange = new RearrangingTheWords();
		rearrange.sortWords("is2 sentence4 This1 a3");
		rearrange.sortWords("Myself2 Me1 I4 and3");
	}

	public void sortWords(String string) {
//Split the input 'string' using spaces and store in the 'split' array    	
		String[] split = string.split(" ");
//   Print the 'split' array elements		
		System.out.println(Arrays.toString(split));
// Get the 'length' of the 'split' array
		int length = split.length;
//Initialize an empty 'result' string		
		String result = "";
// Loop over numbers from 1 to the 'length'
		for (int i = 1; i <= length; i++) {
// Convert the number to a string 'str'			
			String str = Integer.toString(i);
// Loop over each element of the 'split' array

			for (int k = 0; k <= length - 1; k++) {
// If the current element contains the 'str'				
				if (split[k].contains(str)) {
//     Replace the 'str' with an empty string in the element and store it in 'replace'					
					String replace = split[k].replace(str, " ");
//  Append 'replace' to the 'result'
					result = result + replace;
				}
			}
		}
// Print the 'result' string		
		System.out.println(result);
	}
}