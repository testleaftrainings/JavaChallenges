package javaChallenge;

//Java Problem (7/20)
//
//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//
//Example 1:
//
//Input: nums = [1,2,3,1]
//Output: true
//Example 2:
//
//Input: nums = [1,2,3,4]
//Output: false
//Example 3:
//
//Input: nums = [1,1,1,3,3,4,3,2,4,2]
//Output: true

public class RepetitiveNumbers {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1 };
		int[] nums_ = { 1, 2, 3, 4 };
		int[] nums_1 = { 1, 1, 1, 3, 3, 4, 3, 2, 4, 2 };
		RepetitiveNumbers repetitive = new RepetitiveNumbers();
		repetitive.findDistinct(nums);
		repetitive.findDistinct(nums_);
		repetitive.findDistinct(nums_1);
	}

	public void findDistinct(int[] nums) {
		// Initialize count to 0
		int count = 0;
		// Loop over each element in the 'nums' array
		for (int i = 0; i < nums.length; i++) {
			// Loop over each element in the 'nums' array except the first element
			for (int j = 1; j < nums.length; j++) {
				// If the current element is equal to another element and they're not at the
				// same index
				if (nums[i] == nums[j] && i != j) {
					// Increment the 'count' variable
					count++;
				}
			}
		}
		// If 'count' is greater than or equal to 1
		if (count >= 1) {
			// Print "true"
			System.out.println("true");
		} else
			// Print "false"
			System.out.println("false");

	}

}
