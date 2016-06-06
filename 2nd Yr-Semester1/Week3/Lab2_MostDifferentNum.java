/*
 * The goal is to read in a list of integers into an array and output the one which is closest to the average.
 * For example the average of 4, 8, 2, 3 and 5 is 4.25, and 4 is the closest to this. If there are two values 
 * equally close then choose the one which was earliest in the list.
 * 
 * Input Format:
 * The first line contains N, the number of inputs.
 * The second line contains N integers seperated by a space.
 * 
 * Output Format:
 * A number that represents the value that is closest to the average.
 */

package Week3;

import java.io.File;
import java.util.*;

public class Lab2_MostDifferentNum {
	public static void main(String args[]) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week3\\input.txt");
		Scanner myscanner = new Scanner(input);

		while (myscanner.hasNext()) {
			int average = 0;
			int number = Integer.parseInt(myscanner.nextLine());
			int[] array = new int[number];
			for (int i = 0; i < number; i++) {
				array[i] = Integer.parseInt(myscanner.next());
				average = average + array[i];
			}
			average = average / number;
			
			int closest = Math.abs(array[array.length-1] - average);
			int slot = array.length-1;
			for (int i = array.length-1; i >-1; i--) {
				if (Math.abs(array[i] - average) < closest) {
					closest = Math.abs(array[i] - average);
					slot = i;
				}
			}
			System.out.println("Your output: " + array[slot]);
			System.out.print(myscanner.nextLine());
			System.out.println(myscanner.nextLine());
			System.out.println(myscanner.nextLine());
		}
	}

}
