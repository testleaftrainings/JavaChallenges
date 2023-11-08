package javaChallenge;

//Java Problem (8/20)
//
//Given an integer array nums andPr an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.
//
//Example 1:
//
//Input: nums = [1,2,3,1], k = 3
//Output: true
//Example 2:
//
//Input: nums = [1,0,1,1], k = 1
//Output: true
//Example 3:
//
//Input: nums = [1,2,3,1,2,3], k = 2
//Output: false

public class FindTwoDistinctArray {

	public static void main(String[] args) {

		FindTwoDistinctArray find = new FindTwoDistinctArray();
		int[] nums = { 1, 2, 3, 1 };
		int k = 3;
		find.findResult(nums, k);

	}

	public void findResult(int[] nums, int k) {
		// Declare an int variable count and set it to 0
		int count = 0;
		// loop through the array with index i from 0 to the length of nums - 1:(outer
		// loop)
		for (int i = 0; i <= nums.length - 1; i++) {
			// loop through the nums array with index j from i + 1 to the length of nums -
			// 1:(inner loop)
			for (int j = i + 1; j <= nums.length - 1; j++) {
				// If the elements at indexes i and j are the same and the absolute difference
				// between i and j is less than or equal to k:
				if ((nums[i] == nums[j]) && Math.abs((i - j)) <= k) {
					// if matches increase count by 1
					count++;
				}
			}
		}
		// Compare the count is greater than 0:
		if (count > 0) {
			// if matches print as "True"
			System.out.println("True");
		} else {
			// else matches print as "False"
			System.out.println("False");
		}

	}
}
