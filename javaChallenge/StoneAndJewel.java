package javaChallenge;

//Java Problem (10/20)

//
//You're given strings jewels representing the types of stones that are jewels, and stones representing the stones you have. Each character in stones is a type of stone you have. You want to know how many of the stones you have are also jewels.
//
//Letters are case sensitive, so "a" is considered a different type of stone from "A".
//
//Example 1:
//
//Input: jewels = "aA", stones = "aAAbbbb"
//Output: 3
//Example 2:
//
//Input: jewels = "z", stones = "ZZ"
//Output: 0

public class StoneAndJewel {

	
	public void findStones(String jewels, String stones) {
		// Convert the jewels string to a character array and store it in jewelsArray
		char[] jewelsArray = jewels.toCharArray();
		// Convert the stones string to a character array and store it in stonesArray

		char[] stonesArray = stones.toCharArray();
		// Declare an integer count and SET it to 0
		int count = 0;
		// Iterate into each element in the char array using nested for loop
		for (int i = 0; i <= stonesArray.length - 1; i++) {
			for (int j = 0; j <= jewelsArray.length - 1; j++) {
				// Comapre the elements in the array
				if (stonesArray[i] == jewelsArray[j]) {
					// if it is equal, increase count by 1
					count++;
				}
			}
		}
		// Print the count of the stones
		System.out.println("The number of stones " + count);
	}
	
	public static void main(String[] args) {

		String jewels = "aA";
		String stones = "aAAbbbb";
		String jewels_ = "z";
		String stones_ = "ZZ";
		StoneAndJewel find = new StoneAndJewel();
		find.findStones(jewels, stones);
		find.findStones(jewels_, stones_);
	}

}
