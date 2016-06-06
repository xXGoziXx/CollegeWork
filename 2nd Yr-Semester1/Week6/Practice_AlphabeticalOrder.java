/* 
 * Goal is to sort a list of words by alphabetical order.
 * 
 * Input format:
 * First line contains N (number of words) followed by N lines.
 * Each line contains a String.
 * 
 *  Output format: 
 *  A line consisting of the words sorted in alphabetical order, each separated by a space.
 */

package Week6;

import java.io.File;
import java.util.*;

public class Practice_AlphabeticalOrder {

	public static void main(String args[]) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week6\\AlphabetOrder_Input.txt");
		Scanner scan = new Scanner(input);

		while (scan.hasNext()) {
			int num = Integer.parseInt(scan.nextLine());
			// String array
			String list[] = new String[num];

			// Fill out the array with words
			for (int i = 0; i < list.length; i++) {
				list[i] = scan.nextLine();
			}

			// SORTING PART
			// TEMP VAR
			String temp = new String();

			// Looping through words
			for (int i = 0; i < list.length - 1; i++) {
				// Comparing word at position i with each word after that
				for (int j = i + 1; j < list.length; j++) {
					if (list[i].compareToIgnoreCase(list[j]) > 0) {
						temp = list[i];
						list[i] = list[j];
						list[j] = temp;
					}
				}

			}
			System.out.print("Your output: ");
			// PRINTING OUT THE ARRAY PART
			for (int k = 0; k < list.length; k++) {
				System.out.print(list[k] + " ");
			}
			System.out.println();
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}

	}

}
