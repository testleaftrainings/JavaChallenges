package javaChallenge;

import java.util.HashMap;
import java.util.Map;

//Java Problem :18/20
//You are given an integer array nums. The unique elements of an array are the elements that appear exactly once in the array.
//
//Return the sum of all the unique elements of nums.
//
//Example 1:
//
//Input: nums = [1,2,3,2]
//Output: 4
//Explanation: The unique elements are [1,3], and the sum is 4.
//Example 2:
//
//Input: nums = [1,1,1,1,1]
//Output: 0
//Explanation: There are no unique elements, and the sum is 0.
//Example 3:
//
//Input: nums = [1,2,3,4,5]
//Output: 15
//Explanation: The unique elements are [1,2,3,4,5], and the sum is 15.

public class PrintUniqueArray {

	public static int sumOfUniqueele(int[] nums) {
		// Declare an empty map to store the array elements
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		// iterate to array element to find the occurrence count
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
		}
		// initialize a variable sum and store the sum of the unique elements
		int sum = 0;
		//iterate the elements in the map ketSet
		for (int key : map.keySet()) {
			// compare the key in map equals 1 then add the elements
			if (map.get(key) == 1) {
				sum += key;
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sumOfUniqueele = sumOfUniqueele(arr);
		System.out.println(sumOfUniqueele);
	}

}
