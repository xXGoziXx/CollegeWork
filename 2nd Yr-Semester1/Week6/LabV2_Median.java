/* THIS VERSION REQUIRES A BIT OF CASTING NUMBERS !!!
 * 
 * 
 * The goal is to read in a list of integers into an array and output the one which is the median, that is,
 * the one which if you put them all in order would be in the middle. 
 * If there are two in the middle then take the average of those two. 
 * For example the median of 4, 8, 2, 3 and 5 is 4, because if you put them all in order 4 would be the middle value. 
 * The median of 2, 7, 4, and 9 is 5.5 because 5.5 is the average of 4 and 7.
 * 
 * Input format:
 * The first line contains N, the number of inputs.
 * The second line contains N integers seperated by a space.
 * 
 * Output format:
 * A double that represents the median.
 */

package Week6;

import java.io.File;
import java.util.*;

public class LabV2_Median {
	public static void main(String args[]) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week6\\Median_Input.txt");
		Scanner scan = new Scanner(input);
		
		while (scan.hasNext()) {
			int array[] = new int[Integer.parseInt(scan.nextLine())];
			double result = 0;
			int temp = 0;

			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(scan.next());
			}

			for (int i = 0; i < array.length; i++) {
				for (int j = i + 1; j < array.length; j++) {
					if (array[i] > array[j]) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;
					}
				}
			}

			 if(array.length % 2 == 0){
		            result = (double)(array[array.length/2 - 1] + array[array.length/2]) / 2;
		            System.out.println(result);
		        }
		        else{
		            result = (double)array[array.length/2];
		            System.out.println(result);
		        }
			
			System.out.print(scan.nextLine());
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}
	}

}
