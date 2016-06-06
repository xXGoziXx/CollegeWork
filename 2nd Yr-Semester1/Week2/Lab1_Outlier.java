/*
 * The goal is to read in 3 numbers and output the one which is most different from the other two
 * (i.e. the one with the greatest difference from the nearest number to it). If there is no 
 * single outlier then output "NA".
 * 
 * 
 */



package Week2;

import java.util.*;
import java.io.*;

public class Lab1_Outlier {
	public static void main(String args[]) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week2\\input.txt");
		Scanner myScanner = new Scanner(input);
		
		while(myScanner.hasNext())
		{
			//First number
			int one = Integer.parseInt(myScanner.next());
			//second number
			int two = Integer.parseInt(myScanner.next());
			//third number
			int three = Integer.parseInt(myScanner.next());
			//average
			int average = (one + two + three) / 3;
			//first difference
			int onediff = Math.abs(one - average);
			//second difference
			int twodiff = Math.abs(two - average);
			//third difference
			int threediff = Math.abs(three - average);
			
				if (onediff > twodiff && onediff > threediff) {
					System.out.println("Your output: " + one);
				}
				else if (twodiff > onediff && twodiff > threediff) {
					System.out.println("Your output: " + two);
				}
				else if (threediff > twodiff && threediff > onediff) {
					System.out.println("Your output: " + three);
				}
				else {
					System.out.println("Your output: " + "NA");
				}
			
			System.out.print(myScanner.nextLine());
			System.out.println(myScanner.nextLine());
			System.out.println(myScanner.nextLine());
		}
	}

}
