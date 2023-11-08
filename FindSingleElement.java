package javaChallenge;
//Given a non-empty array of integers nums, every element appears twice except for one.

// Find that single one.
//
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//
//
//
//Example 1:
//
//Input: nums = [2,2,1]
//Output: 1
//Example 2:
//
//Input: nums = [4,1,2,1,2]
//Output: 4
//Example 3:
//
//Input: nums = [1]
//Output: 1

public class FindSingleElement {
	
	public void findSingleElement(int[] intArray) {

// use nested for loop to traverse through each array element 
		for (int i = 0; i < intArray.length; i++) {
			// initialize a variable count as 0
			int count = 0;
				for (int j = 0; j < intArray.length; j++) {
			      //Compare the array elements 
				if (intArray[i] == intArray[j]) {
					//if matches, increase the count by 1
					count++;
				}
			}

			//use another if loop to check the count for 1

			if (count == 1) {
				
				//If matches print the element of current index
				System.out.println("Single one Element in the Array is ==> " + intArray[i]);
			}
		}

	}

	public static void main(String[] args) {
		
		FindSingleElement element = new FindSingleElement();
		int[] nums = { 2, 2, 1 };
		int[] nums_ = { 4, 1, 2, 1, 2 };
		int[] nums1 = { 1 };
		element.findSingleElement(nums);
		element.findSingleElement(nums_);
		element.findSingleElement(nums1);
	}

}