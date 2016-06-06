/*
 * The goal is to read in a list of integers into an array, read in an integer x, and print out the
 * xth biggest number.
 * For example given the list: 4,8,2,3,5 and x is 2, then you should output 5 because 
 * 5 is the second biggest number in the list
 * 
 * So you have to sort the list first:
 * 2,3,4,5,8
 * And we see that the second last is 5.
 * 
 * Input format:
 * First line contains N, the number of items in the list.
 * The second line contains N integers seperated by a space.
 * The third line contains an integer x.
 * 
 * Output format:
 * An integer which is the xth biggest in the list.
 * 
 */

package Week6;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class LabV1_Xth_Biggest {
	public static void main (String args[]) throws Exception{
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week6\\LabV1_Input.txt");
		Scanner scan = new Scanner(input);

		while(scan.hasNext()){
			int array[] = new int[Integer.parseInt(scan.nextLine())];

			for(int i = 0; i < array.length; i++){
				array[i] = scan.nextInt();
			}

			for(int i = 0; i < array.length; i++){
				for(int j = 0; j < array.length-1; j++){
					if(array[j] < array[j+1]){
						int temp = array[j];
						array[j] = array[j+1];
						array[j+1] = temp;
					}
				}
			}
			
			int x = scan.nextInt();
			System.out.println(array[x-1]);
			System.out.print(scan.nextLine());
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());


		}
	}


}
