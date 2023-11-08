package javaChallenge;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

//Given an array of integers arr, return true if the number of occurrences of each value in the array is unique, or false otherwise.
//
//Example 1:
//
//Input: arr = [1,2,2,1,1,3]
//Output: true
//Explanation: The value 1 has 3 occurrences, 2 has 2 and 3 has 1. No two values have the same number of occurrences.
//Example 2:
//
//Input: arr = [1,2]
//Output: false
//Example 3:
//
//Input: arr = [-3,0,1,-3,1,1,1,-3,10,0]
//Output: true
public class NumberOfOccurrence {

	public static void main(String[] args) {
		// Sample arrays
		int[] arr = { 1, 2, 2, 1, 1, 3 };
		int[] arr_ = { 1, 2 };
		int[] arr_1 = { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 };

		NumberOfOccurrence find = new NumberOfOccurrence();

		find.findOccurance(arr);
		find.findOccurance(arr_);
		find.findOccurance(arr_1);

	}

	public void findOccurance(int[] intArray) {

		// Sort the input array
		Arrays.sort(intArray);
		int count = 0;
		// Use a LinkedHashSet to store unique integers
		Set<Integer> unique = new LinkedHashSet<Integer>();
		//Iterate into the array elements and add to set
		for (int i = 0; i <= intArray.length - 1; i++) {
			unique.add(intArray[i]);
		}
		// Convert the set to a list
		List<Integer> ele = new ArrayList<Integer>(unique);
		// Create a list to store the counts of occurrences
		List<Integer> resultList = new ArrayList<Integer>();

		// Count the occurrences of each unique integer
		for (int i = 0; i <= ele.size() - 1; i++) {
			count = 0;
			for (int j = 0; j <= intArray.length - 1; j++) {
				//if matches, add to list
				if (ele.get(i) == intArray[j]) {
					count++;
				}
			}
			resultList.add(count);

		}

		// Use a LinkedHashSet to store the unique counts of occurrences
		Set<Integer> resultSet = new LinkedHashSet<Integer>();
		boolean add = true;
		for (int i = 0; i <= resultList.size() - 1; i++) {
			add = resultSet.add(resultList.get(i));
			// If an element is not added to the set, break the loop
			if (add == false) {

				break;
			}

		}
		// Print the result, indicating whether there are duplicate counts
		if (add == false) {
			System.out.println(add);
		} else {
			System.out.println(add);
		}

	}

}