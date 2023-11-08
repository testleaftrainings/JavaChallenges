package javaChallenge;

//Java Problem (6/20)
//
//Given an array nums of size n, return the majority element.
//
//The majority element is the element that appears more than n / 2 times. You may assume that the majority element always exists in the array.
//
//Example 1:
//
//Input: nums = [3,2,3]
//Output: 3
//Example 2:
//
//Input: nums = [2,2,1,1,1,2,2]
//Output: 2
public class MajorityElement {
	public static void main(String[] args) {
		int[] nums = { 3, 2, 3 };
		// Declare integers count, temp, and counter and set all to 0
		int temp = 0, counter = 0;
		// loop through the nums array with index i from 0 to the length of nums:
		for (int i = 0; i < nums.length; i++) {
			// iniitalize the int varaible as count to 0
			int count = 0;
			// loop through the nums array with index j from 0 to the length of nums:
			for (int j = 0; j < nums.length; j++) {
				// If the element at index i is equal to the element at index j:
				if (nums[i] == nums[j]) {
					// if equals,increase the count by 1
					count++;
				}			}
			// If the count of the element at index i is greater than half the length of nums:
			if (count > nums.length / 2) {
				// set temp to the element at index i

				temp = nums[i];
				// assign count_ to the count of the element at index i
				counter = count;
			}
		}
		// If counter is greater than half the length of nums:
		if (counter > nums.length / 2) {
			// print the temp variable
			System.out.println("majority element is ====> " + temp);
		} else {

			// print majority of element doesnt exist
			System.out.println("No majority element");
		}

	}

}
