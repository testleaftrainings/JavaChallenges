package javaChallenge;

import java.util.HashMap;

//Java Problem (16/20)
//
//Given an array of integers arr, a lucky integer is an integer that has a frequency in the array equal to its value.
//
//Return the largest lucky integer in the array. If there is no lucky integer return -1. 
//
//Example 1:
//
//Input: arr = [2,2,3,4]
//Output: 2
//Explanation: The only lucky number in the array is 2 because frequency[2] == 2.
//Example 2:
//
//Input: arr = [1,2,2,3,3,3]
//Output: 3
//Explanation: 1, 2 and 3 are all lucky numbers, return the largest of them.
//Example 3:
//
//Input: arr = [2,2,2,3,3]
//Output: -1
//Explanation: There are no lucky numbers in the array.

public class LuckyIntegers {

	public int findLucky(int[] arr) {
		// Create a HashMap to store the frequency of each element
		HashMap<Integer, Integer> frequencyMap = new HashMap<Integer, Integer>();
		//Iterate into array elements and add to the frequencyMap
		for (int num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		//initialize the largestLuckyNumber variable as -1
		int largestLuckyNumber = -1;
		// Iterate through the frequencyMap
		for (int num : frequencyMap.keySet()) {
			//get the occurrence of number form the map
			int frequency = frequencyMap.get(num);
			// compare the occurrence of number with the array value
			if (frequency == num && num > largestLuckyNumber) {
				// if match store the number as largestLuckyNumber
				largestLuckyNumber = num;
			}
		}
		return largestLuckyNumber;
	}

	public static void main(String[] args) {
		LuckyIntegers solution = new LuckyIntegers();
		int[] arr = { 2, 2, 2, 3, 3 };
		int result = solution.findLucky(arr);
		System.out.println("The largest lucky integer is: " + result);
	}
}
