package javaChallenge;

//Java Problem (20/20)

//
//Given a string s and a character c that occurs in s, return an array of integers answer where answer.length == s.length and answer[i] is the distance from index i to the closest occurrence of character c in s.
//
//The distance between two indices i and j is abs(i - j), where abs is the absolute value function. 
//
//Example 1:
//
//Input: s = "aaab", c = "b"
//Output: [3,2,1,0]

public class OccurrenceOfCharacters {

	public static void main(String[] args) {

		String string = "aaab";
		char c = 'b';
		OccurrenceOfCharacters find = new OccurrenceOfCharacters();
		find.findDistance(string, c);

	}

public void findDistance(String string, char c) {
	//Declare an integer variable 'count' and set it to 0
		int count = 0;
		// Convert the 'string' into a character array 'charArray'

		char[] charArray = string.toCharArray();
		//Iterate into each character of the array 
		for (int i = 0; i <= charArray.length - 1; i++) {
			// If the character is not equal to the given character 'c'
			if (charArray[i] != c) {
				// then increment the 'count'  by 1				
				count++;
				//Continue to the next iteration				
				continue;
			}
			else {
				// Loop from 'count' to 0:
				for (int j = count; j >= 0; j--) {
					//Print the numbers from 'count' to 0
					System.out.print(j);
					}
				// Reset the 'count' to 0
				count = 0;
				//Continue to the next iteration
				continue;
			}

		}

	}
}
