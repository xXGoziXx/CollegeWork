/*
 * The goal is to sort a long list of words by special order. The special order is as follows.
 * All the words are sorted by length, starting with the shortest words, and ending with the longest words. 
 * For words that have the same length, these should be sorted alphabetically [a-z].
 * 
 * Input Format:
 * The first line contains N (number of words) followed by N lines. Each line contains a String.
 * There are only five test cases, and each one involves 10 times more words than the last
 * (e.g. 10, 100, 1,000, 10,000, 100,000).
 * 
 * Output Format:
 * Print out each of the sorted N words on a separate line.
 */

package week11;

import java.util.*;
import java.io.*;

public class LabV1_AlphabetAndLengthSort {

	public static void main(String[] args) throws Exception {
		File input = new File(
				"C:/Users/Tomek/OneDrive/College/Year 2/Semester 1/CS210 Algorithms and Data Structures 1/CS210 Labs/src/week11/LabV1_Input.txt");
		Scanner scan = new Scanner(input);
		while (scan.hasNext()) {
			int num = Integer.parseInt(scan.nextLine()); //number of words
			String[] array = new String[num]; // create array

			for (int i = 0; i < num; i++) {
				array[i] = scan.nextLine(); //fill up the array
			}

			MergeSort(array); //call the method

			for (int i = 0; i < num; i++) {
				System.out.println(array[i]); //print the array after sorting it
			}

			System.out.println(scan.nextLine()); //prints the stars (****) to seperate each test case
		}
	}

	public static void MergeSort(String list[]) { //MERGESORT METHOD - SPLITS THE ARRAY INTO TWO
		if (list.length > 1) {
			String left[] = new String[list.length / 2];
			String right[] = new String[list.length - (list.length / 2)];

			for (int i = 0; i < left.length; i++) {
				left[i] = list[i];
			}
			for (int i = 0; i < right.length; i++) {
				right[i] = list[i + list.length / 2];
			}

			MergeSort(left);
			MergeSort(right);
			merge(list, left, right);
		}
	}

	public static void merge(String result[], String left[], String right[]) { //MERGE METHOD - SORTS THE ARRAY
		int posLeft = 0; //position in the left array
		int posRight = 0; //position in the right array

		for (int i = 0; i < result.length; i++) {
			if (posRight >= right.length //if there is no right array
					|| (posLeft < left.length && (left[posLeft].length() < right[posRight].length()))) { //OR there is left array AND lengthLEFT < lengthRIGHT
				result[i] = left[posLeft]; //then put the word from left array in the main array
				posLeft++; //increase the position of left array
			} else if (posRight >= right.length //ELSE if there is no right array
					|| (posLeft < left.length && left[posLeft].length() == right[posRight].length() //OR there is a left array AND both words are equal in length
							&& left[posLeft].compareTo(right[posRight]) < 0)) { //AND  wordLEFT < wordRIGHT (alphabetical order)
				result[i] = left[posLeft]; //then put the word from left array into the main array
				posLeft++; //increase pos in left array
			} else { //ELSE
				result[i] = right[posRight]; //put the element from the right array into the main array
				posRight++; //increase position in right array
			}
		}
	}

}
