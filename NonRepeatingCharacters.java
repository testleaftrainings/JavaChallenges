package javaChallenge;
//Given a string s, find the first non-repeating character in it and return its index. If it does not exist, return -1.

//
//Example 1:
//
//Input: s = "TestLeaf"
//Output: 0
//Example 2:
//
//Input: s = "LoveTestLeaf"
//Output: 1
//Example 3:
//
//Input: s = "aabb"
//Output: -1

public class NonRepeatingCharacters {
	public static void main(String[] args) {
		String string = "LoveTestLeaf";

		// convert the string to a char array 
		char[] charArray = string.toCharArray();
		// declare and initialize a int variables as count and  i to 0		
		int i = 0,count=0;
		// iterate into each index of charArray using nested for loop 
		for (i = 0; i <= charArray.length - 1; i++) {//outer loop
			// reset count to 0
			 count = 0;
					for (int j = 0; j <= charArray.length - 1; j++) {//inner loop
							//write a condition to compare the array elements
						if (charArray[i] == charArray[j] && i != j) {
					// if matches, increase the count by 1
					count++;

				}

			}

			// If count is equal to 0:
			if (count == 0) {
				// print Index position of the Element 
				System.out.println("Index position of the Element " + i);
				break;
			}
			// else if count is greater than or equal to 1 and i is equal to the last index of charArray
			else if (count >= 1 && i == charArray.length - 1) {
				// print -1
				System.out.println(-1);
			} else
				// continue to the next iteration of the loop
				continue;
		}
	}

}