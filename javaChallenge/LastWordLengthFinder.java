package javaChallenge;

import java.util.Arrays;
import java.util.List;

/*Java Challenge (1/20)
Given a string s consisting of words and spaces, return the length of the last word in the string.
A word is a maximal substring consisting of non-space characters only.
 
Example 1:
Input: s = "Hello World"
Output: 5
Explanation: The last word is "World" with length 5.
Example 2:
Input: s = "   fly me   to   the moon  "
Output: 4
Explanation: The last word is "moon" with length 4.
Example 3:
Input: s = "luffy is still joyboy"
Output: 6
Explanation: The last word is "joyboy" with length 6.*/
//Define a class called LengthOfLastWordFinder

public class LastWordLengthFinder {

    // Method to find the length of the last word in a given string
    public void findLengthOfLastWord(String inputString) {
    	 // Split the input string into an array of words
    	String[] wordsArray = inputString.split(" ");
        // Convert the array of words into a List
    	List<String> wordList = Arrays.asList(wordsArray);
        // Retrieve the last word from the list
    	String lastWord = wordList.get(wordList.size() - 1);
    	 // Find the length of the last word
    	int length = lastWord.length();
        System.out.println("The length of the last word '" + lastWord + "' is: " + length); // Display the length of the last word
    }

    public static void main(String[] args) {
        LastWordLengthFinder wordFinder = new LastWordLengthFinder(); // Create an instance of LastWordLengthFinder class

        // Find and display the length of the last word in different strings
        wordFinder.findLengthOfLastWord("Hello World");
        wordFinder.findLengthOfLastWord("fly me to the moon");
        wordFinder.findLengthOfLastWord("luffy is still joyboy");
    }
}