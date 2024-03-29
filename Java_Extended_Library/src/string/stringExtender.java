package string;

import java.util.ArrayList;
import java.util.List;

/**
 * A utility class for extending string functionality.
 */
public class stringExtender {
	/**
	 * Reverses a given string.
	 *
	 * @param str the string to reverse
	 * @return the reversed string
	 */
	public static String reverse(String str) {
		char[] charArray = str.toCharArray();
		int start = 0;
		int end = str.length() - 1;
		while (start < end) {
			char temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
		return new String(charArray);
	}

	/**
	 * Finds the indices of occurrences of a target substring in a string.
	 *
	 * @param str    the string to search
	 * @param target the target substring to find
	 * @return a list of indices where the target substring occurs in the string
	 */
	public static List<Integer> occurrencesOf(String str, String target) {
		List<Integer> indexes = new ArrayList<>();
		int index = str.indexOf(target);
		while (index != -1) {
			indexes.add(index);
			index = str.indexOf(target, index + 1);
		}
		return indexes;
	}

	/**
	 * Finds the frequency of a character in a string.
	 *
	 * @param str the string to search
	 * @param ch  the character to find the frequency of
	 * @return an ArrayList containing the indices where the character occurs in the
	 *         string
	 */
	public static ArrayList<Integer> frequencyOf(String str, char ch) {
		ArrayList<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				indexes.add(i);
			}
		}
		return indexes;
	}

	/**
	 * Finds the index of the first occurrence of a word in a string.
	 *
	 * @param str  the string to search
	 * @param str1 the word to find
	 * @return the index of the first occurrence of the word in the string, or -1 if
	 *         not found
	 */
	public static int findWord(String str, String str1) {
		return str.indexOf(str1);
	}

	/**
	 * Checks if a given string is a palindrome.
	 *
	 * @param str the string to check
	 * @return true if the string is a palindrome, false otherwise
	 */
	public static boolean isPalindrome(String str) {
		// Remove all non-alphanumeric characters and convert to lowercase
		String cleanStr = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

		// Compare characters from start and end of string
		int left = 0;
		int right = cleanStr.length() - 1;
		while (left < right) {
			if (cleanStr.charAt(left) != cleanStr.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}

	/**
	 * Checks if two strings are anagrams of each other.
	 *
	 * @param str1 the first string
	 * @param str2 the second string
	 * @return true if the strings are anagrams, false otherwise
	 */
	public static boolean isAnagram(String str1, String str2) {
		// Remove all non-alphabetic characters and convert to lowercase
		String cleanStr1 = str1.replaceAll("[^a-zA-Z]", "").toLowerCase();
		String cleanStr2 = str2.replaceAll("[^a-zA-Z]", "").toLowerCase();

		// Check if the lengths are different
		if (cleanStr1.length() != cleanStr2.length()) {
			return false;
		}

		// Count the frequency of each character in both strings
		int[] charCount = new int[26]; // Assuming only lowercase alphabets
		for (int i = 0; i < cleanStr1.length(); i++) {
			charCount[cleanStr1.charAt(i) - 'a']++;
			charCount[cleanStr2.charAt(i) - 'a']--;
		}

		// Check if all character counts are 0
		for (int count : charCount) {
			if (count != 0) {
				return false;
			}
		}

		return true;
	}

}
