package javaChallenge;

import java.util.ArrayList;
import java.util.List;

//Java Problem (18/20)
//
//A distinct string is a string that is present only once in an array.
//
//Given an array of strings arr, and an integer k, return the kth distinct string present in arr. If there are fewer than k distinct strings, return an empty string "".
//
//Note that the strings are considered in the order in which they appear in the array.
//
// 
//
//Example 1:
//
//Input: arr = ["d","b","c","b","c","a"], k = 2
//Output: "a"
//Explanation:
//The only distinct strings in arr are "d" and "a".
//"d" appears 1st, so it is the 1st distinct string.
//"a" appears 2nd, so it is the 2nd distinct string.
//Since k == 2, "a" is returned. 
//Example 2:
//
//Input: arr = ["aaa","aa","a"], k = 1
//Output: "aaa"
//Explanation:
//All strings in arr are distinct, so the 1st string "aaa" is returned.
//Example 3:
//
//Input: arr = ["a","b","a"], k = 3
//Output: ""
//Explanation:
//The only distinct string is "b". Since there are fewer than 3 distinct strings, we return an empty string "".

public class DistinctString {

	public static void main(String[] args) {
		DistinctString find = new DistinctString();

		String[] arr = { "d", "b", "c", "b", "c", "a" };
		String[] arr_ = { "aaa", "aa", "a" };
		String[] arr_1 = { "a", "b", "a" };

		int k = 2, k_ = 1, k_1 = 3;

		find.findPosition(arr, k);
		find.findPosition(arr_, k_);
		find.findPosition(arr_1, k_1);

	}

	public void findPosition(String[] arr, int k) {

		// create a empty list to store the result
		List<String> stringList = new ArrayList<String>();
		// using for loop iterate into each elements of array
		for (int i = 0; i <= arr.length - 1; i++) {
			// initialize the count variable as 0
			int count = 0;
			// Compare the elements of array based on index position
			for (int j = 0; j <= arr.length - 1; j++) {
				if (arr[i] == arr[j]) {
					// if matches increase the count
					count++;
				}
			} // check the condition if count is 1 then add the character to list
			if (count == 1) {
				stringList.add(arr[i]);
			}
		}
		System.out.println(stringList);

		//Compare if list size greater than the k (distinct String)
		if ((stringList.size()) >= k) {
			//print the previous distinct string
			System.out.println(stringList.get(k - 1));
			System.out.println("========================");
		} else {
			//print as empty string
			System.out.println("empty string ");
			System.out.println("========================");
		}

	}

}
