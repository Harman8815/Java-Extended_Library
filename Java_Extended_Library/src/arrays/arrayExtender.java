package arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * The arrayExtender class provides static methods for reversing arrays of
 * various types and printing arrays of primitive types and strings.
 */
public class arrayExtender {
	/**
	 * Reverses an array of integers.
	 * 
	 * @param A the array of integers to reverse
	 * @return the reversed array
	 */
	public static int[] reverse(int[] A) {
		int j = A.length - 1;
		for (int i = 0; i < A.length / 2; i++) {
			swap(A, i, j);
			j--;
		}
		return A;
	}

	/**
	 * Reverses a subarray of integers within the given range.
	 *
	 * @param A the array of integers
	 * @param s the start index of the subarray (inclusive)
	 * @param e the end index of the subarray (inclusive)
	 * @return the array with the subarray reversed, or the original array if an
	 *         exception occurs
	 */
	public static int[] reverse(int[] A, int s, int e) {
		try {
			int j = e;
			for (int i = s; i < (s + e) / 2; i++) {
				swap(A, i, j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index out of bounds");
		}
		return A;
	}

	/**
	 * Reverses an array of doubles within the given range.
	 * 
	 * @param A the array of doubles to reverse
	 * @return the reversed array
	 */
	public static double[] reverse(double[] A) {
		int j = A.length - 1;
		for (int i = 0; i < A.length / 2; i++) {
			swap(A, i, j);
			j--;
		}
		return A;
	}

	/**
	 * Reverses an array of doubles.
	 * 
	 * @param A the array of doubles to reverse
	 * @param s the start index of the subarray (inclusive)
	 * @param e the end index of the subarray (inclusive)
	 * @return the reversed array
	 */
	public static double[] reverse(double[] A, int s, int e) {
		try {
			int j = e;
			for (int i = s; i < (s + e) / 2; i++) {
				swap(A, i, j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index out of bounds");
		}
		return A;
	}

	/**
	 * Reverses an array of characters.
	 * 
	 * @param A the array of characters to reverse
	 * @return the reversed array
	 */
	public static char[] reverse(char[] A) {
		int j = A.length - 1;
		for (int i = 0; i < A.length / 2; i++) {
			swap(A, i, j);
			j--;
		}
		return A;
	}

	/**
	 * Reverses an array of character within the given range.
	 * 
	 * @param A the array of character to reverse
	 * @param s the start index of the subarray (inclusive)
	 * @param e the end index of the subarray (inclusive)
	 * @return the reversed array
	 */
	public static char[] reverse(char[] A, int s, int e) {
		try {
			int j = e;
			for (int i = s; i < (s + e) / 2; i++) {
				swap(A, i, j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index out of bounds");
		}
		return A;
	}

	/**
	 * Reverses an array of characters.
	 * 
	 * @param A the array of characters to reverse
	 * @return the reversed array
	 */
	public static float[] reverse(float[] A) {
		int j = A.length - 1;
		for (int i = 0; i < A.length / 2; i++) {
			swap(A, i, j);
			j--;
		}
		return A;
	}

	/**
	 * Reverses an array of characters.
	 * 
	 * @param A the array of characters to reverse
	 * @return the reversed array
	 */
	public static float[] reverse(float[] A, int s, int e) {
		try {
			int j = e;
			for (int i = s; i < (s + e) / 2; i++) {
				swap(A, i, j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index out of bounds");
		}
		return A;
	}

	/**
	 * Reverses an array of strings.
	 * 
	 * @param A the array of strings to reverse
	 * @param s the start index of the subarray (inclusive)
	 * @param e the end index of the subarray (inclusive)
	 * @return the reversed array
	 */
	public static String[] reverse(String[] A) {
		int j = A.length - 1;
		for (int i = 0; i < A.length / 2; i++) {
			swap(A, i, j);
			j--;
		}
		return A;
	}

	public static String[] reverse(String[] A, int s, int e) {
		try {
			int j = e;
			for (int i = s; i < (s + e) / 2; i++) {
				swap(A, i, j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index out of bounds");
		}
		return A;
	}

	/**
	 * Reverses an array of objects.
	 *
	 * @param <T> the type of elements in the array
	 * @param A   the array to reverse
	 * @return the reversed array
	 */
	public static <T> T[] reverse(T[] A) {
		try {
			int j = A.length - 1;
			for (int i = 0; i < A.length / 2; i++) {
				swap(A, i, j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index out of bounds");
		}
		return A;
	}

	/**
	 * Reverses an array of objects.
	 *
	 * @param <T> the type of elements in the array
	 * @param A   the array to reverse
	 * @param s   the start index of the subarray (inclusive)
	 * @param e   the end index of the subarray (inclusive)
	 * @return the reversed array
	 */
	public static <T> T[] reverse(T[] A, int s, int e) {
		try {
			int j = e;
			for (int i = s; i < (s + e) / 2; i++) {
				swap(A, i, j);
				j--;
			}
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Index out of bounds");
		}
		return A;
	}

	private static <T> void swap(T[] arr, int i, int j) {
		T temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * Swaps two elements in an array of integers.
	 * 
	 * @param arr the array in which to swap elements
	 * @param i   the index of the first element to swap
	 * @param j   the index of the second element to swap
	 */
	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * Swaps two elements in an array of doubles.
	 * 
	 * @param arr the array in which to swap elements
	 * @param i   the index of the first element to swap
	 * @param j   the index of the second element to swap
	 */
	private static void swap(double[] arr, int i, int j) {
		double temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * Swaps two elements in an array of floats.
	 * 
	 * @param arr the array in which to swap elements
	 * @param i   the index of the first element to swap
	 * @param j   the index of the second element to swap
	 */
	private static void swap(float[] arr, int i, int j) {
		float temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * Swaps two elements in an array of characters.
	 * 
	 * @param arr the array in which to swap elements
	 * @param i   the index of the first element to swap
	 * @param j   the index of the second element to swap
	 */
	private static void swap(char[] arr, int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * Swaps two elements in an array of strings.
	 * 
	 * @param arr the array in which to swap elements
	 * @param i   the index of the first element to swap
	 * @param j   the index of the second element to swap
	 */
	private static void swap(String[] arr, int i, int j) {
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	/**
	 * Prints an array of integers, doubles, characters, floats, or strings.
	 * 
	 * @param arr the array to print
	 */
	public static void print(Object arr) {
		if (arr instanceof int[]) {
			for (int i : (int[]) arr) {
				System.out.print(i + " ");
			}
		} else if (arr instanceof double[]) {
			for (double d : (double[]) arr) {
				System.out.print(d + " ");
			}
		} else if (arr instanceof char[]) {
			for (char c : (char[]) arr) {
				System.out.print(c + " ");
			}
		} else if (arr instanceof float[]) {
			for (float f : (float[]) arr) {
				System.out.print(f + " ");
			}
		} else if (arr instanceof String[]) {
			for (String s : (String[]) arr) {
				System.out.print(s + " ");
			}
		}
		System.out.println();
	}

	/**
	 * Searches for a target value in a sorted array of integers using binary
	 * search.
	 *
	 * @param A      the sorted array of integers to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public int bSearch(int[] A, int target) {
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a subarray of a sorted array of integers using
	 * binary search.
	 *
	 * @param A      the sorted array of integers to search
	 * @param target the target value to search for
	 * @param start  the start index of the subarray (inclusive)
	 * @param end    the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public int bSearch(int[] A, int target, int start, int end) {
		int left = start;
		int right = end;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a sorted array of doubles using binary search.
	 *
	 * @param A      the sorted array of doubles to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int bSearch(double[] A, double target) {
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a sorted subarray of doubles using binary
	 * search.
	 *
	 * @param A      the sorted array of doubles to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int bSearch(double[] A, double target, int s, int e) {
		int left = s;
		int right = e;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a sorted array of floats using binary search.
	 *
	 * @param A      the sorted array of floats to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int bSearch(float[] A, float target) {
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a sorted subarray of floats using binary
	 * search.
	 *
	 * @param A      the sorted array of floats to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int bSearch(float[] A, float target, int s, int e) {
		int left = s;
		int right = e;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a sorted array of characters using binary
	 * search.
	 *
	 * @param A      the sorted array of characters to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int bSearch(char[] A, char target) {
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a sorted subarray of characters using binary
	 * search.
	 *
	 * @param A      the sorted array of characters to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int bSearch(char[] A, char target, int s, int e) {
		int left = s;
		int right = e;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (A[mid] == target) {
				return mid;
			} else if (A[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a sorted array of strings using binary search.
	 *
	 * @param A      the sorted array of strings to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int bSearch(String[] A, String target) {
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int compare = A[mid].compareTo(target);
			if (compare == 0) {
				return mid;
			} else if (compare < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a sorted subarray of strings using binary
	 * search.
	 *
	 * @param A      the sorted array of strings to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int bSearch(String[] A, String target, int s, int e) {
		int left = s;
		int right = e;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int compare = A[mid].compareTo(target);
			if (compare == 0) {
				return mid;
			} else if (compare < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a sorted array using binary search.
	 *
	 * @param <T>    the type of elements in the array, must implement Comparable
	 * @param A      the sorted array to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static <T extends Comparable<T>> int bSearch(T[] A, T target) {
		int left = 0;
		int right = A.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int compare = A[mid].compareTo(target);
			if (compare == 0) {
				return mid;
			} else if (compare < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Searches for a target value in a sorted subarray using binary search.
	 *
	 * @param <T>    the type of elements in the array, must implement Comparable
	 * @param A      the sorted array to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static <T extends Comparable<T>> int bSearch(T[] A, T target, int s, int e) {
		int left = s;
		int right = e;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int compare = A[mid].compareTo(target);
			if (compare == 0) {
				return mid;
			} else if (compare < 0) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in the entire array.
	 *
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int lSearch(int[] A, int target) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in a specific range of indices.
	 *
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int lSearch(int[] A, int target, int s, int e) {
		for (int i = s; i <= e; i++) {
			if (A[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in the entire array.
	 *
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int lSearch(double[] A, double target) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in a specific range of indices.
	 *
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int lSearch(double[] A, double target, int s, int e) {
		for (int i = s; i <= e; i++) {
			if (A[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in the entire array.
	 *
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int lSearch(float[] A, float target) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in a specific range of indices.
	 *
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int lSearch(float[] A, float target, int s, int e) {
		for (int i = s; i <= e; i++) {
			if (A[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in the entire array.
	 *
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int lSearch(String[] A, String target) {
		for (int i = 0; i < A.length; i++) {
			if (A[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in a specific range of indices.
	 *
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int lSearch(String[] A, String target, int s, int e) {
		for (int i = s; i <= e; i++) {
			if (A[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in the entire array.
	 *
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int lSearch(char[] A, char target) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in a specific range of indices.
	 *
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static int lSearch(char[] A, char target, int s, int e) {
		for (int i = s; i <= e; i++) {
			if (A[i] == target) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in the entire array.
	 *
	 * @param <T>    the type of elements in the array
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @return the index of the target value if found, otherwise -1
	 */
	public static <T> int lSearch(T[] A, T target) {
		for (int i = 0; i < A.length; i++) {
			if (A[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Linear search for a target value in a specific range of indices.
	 *
	 * @param <T>    the type of elements in the array
	 * @param A      the array to search
	 * @param target the target value to search for
	 * @param s      the start index of the subarray (inclusive)
	 * @param e      the end index of the subarray (inclusive)
	 * @return the index of the target value if found, otherwise -1
	 */
	public static <T> int lSearch(T[] A, T target, int s, int e) {
		for (int i = s; i <= e; i++) {
			if (A[i].equals(target)) {
				return i;
			}
		}
		return -1;
	}

	/**
	 * Finds the indices of occurrences of a target value in an integer array.
	 *
	 * @param a      the integer array to search
	 * @param target the target value to find
	 * @return an array of indices where the target value occurs in the array
	 */
	public static int[] occurrences(int[] a, int target) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in a specified range of
	 * indices in an integer array.
	 *
	 * @param a      the integer array to search
	 * @param target the target value to find
	 * @param s      the start index of the range (inclusive)
	 * @param e      the end index of the range (inclusive)
	 * @return an array of indices where the target value occurs in the specified
	 *         range of the array
	 */
	public static int[] occurrences(int[] a, int target, int s, int e) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = s; i <= e; i++) {
			if (a[i] == target) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in a double array.
	 *
	 * @param a      the double array to search
	 * @param target the target value to find
	 * @return an array of indices where the target value occurs in the array
	 */
	public static int[] occurrences(double[] a, double target) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in a specified range of
	 * indices in a double array.
	 *
	 * @param a      the double array to search
	 * @param target the target value to find
	 * @param s      the start index of the range (inclusive)
	 * @param e      the end index of the range (inclusive)
	 * @return an array of indices where the target value occurs in the specified
	 *         range of the array
	 */
	public static int[] occurrences(double[] a, double target, int s, int e) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = s; i <= e; i++) {
			if (a[i] == target) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in a float array.
	 *
	 * @param a      the float array to search
	 * @param target the target value to find
	 * @return an array of indices where the target value occurs in the array
	 */
	public static int[] occurrences(float[] a, float target) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in a specified range of
	 * indices in a float array.
	 *
	 * @param a      the float array to search
	 * @param target the target value to find
	 * @param s      the start index of the range (inclusive)
	 * @param e      the end index of the range (inclusive)
	 * @return an array of indices where the target value occurs in the specified
	 *         range of the array
	 */
	public static int[] occurrences(float[] a, float target, int s, int e) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = s; i <= e; i++) {
			if (a[i] == target) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in a char array.
	 *
	 * @param a      the char array to search
	 * @param target the target value to find
	 * @return an array of indices where the target value occurs in the array
	 */
	public static int[] occurrences(char[] a, char target) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i] == target) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in a specified range of
	 * indices in a char array.
	 *
	 * @param a      the char array to search
	 * @param target the target value to find
	 * @param s      the start index of the range (inclusive)
	 * @param e      the end index of the range (inclusive)
	 * @return an array of indices where the target value occurs in the specified
	 *         range of the array
	 */
	public static int[] occurrences(char[] a, char target, int s, int e) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = s; i <= e; i++) {
			if (a[i] == target) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in a String array.
	 *
	 * @param a      the String array to search
	 * @param target the target value to find
	 * @return an array of indices where the target value occurs in the array
	 */
	public static int[] occurrences(String[] a, String target) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(target)) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in a specified range of
	 * indices in a String array.
	 *
	 * @param a      the String array to search
	 * @param target the target value to find
	 * @param s      the start index of the range (inclusive)
	 * @param e      the end index of the range (inclusive)
	 * @return an array of indices where the target value occurs in the specified
	 *         range of the array
	 */
	public static int[] occurrences(String[] a, String target, int s, int e) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = s; i <= e; i++) {
			if (a[i].equals(target)) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in an array.
	 *
	 * @param a      the array to search
	 * @param target the target value to find
	 * @return an array of indices where the target value occurs in the array
	 */
	public static <T> int[] occurrences(T[] a, T target) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			if (a[i].equals(target)) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

	/**
	 * Finds the indices of occurrences of a target value in a specified range of
	 * indices in an array.
	 *
	 * @param a      the array to search
	 * @param target the target value to find
	 * @param s      the start index of the range (inclusive)
	 * @param e      the end index of the range (inclusive)
	 * @return an array of indices where the target value occurs in the specified
	 *         range of the array
	 */
	public static <T> int[] occurrences(T[] a, T target, int s, int e) {
		List<Integer> indexes = new ArrayList<>();
		for (int i = s; i <= e; i++) {
			if (a[i].equals(target)) {
				indexes.add(i);
			}
		}
		return indexes.stream().mapToInt(Integer::intValue).toArray();
	}

}
