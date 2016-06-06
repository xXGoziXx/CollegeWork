/*
 * The goal is to check if a number is prime or not. If it is a prime number, output TRUE, otherwise FALSE.
 * 
 * Input format:
 * An integer N.
 * 
 * Output format: 
 * TRUE - if it is a prime number.
 * FALSE - if it's not a prime number.
 */

package Week5;

import java.io.File;
import java.util.*;

public class Practice_IsPrime {
	public static void main(String args[]) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week5\\Practice_Input.txt");
		Scanner scan = new Scanner(input);

		while (scan.hasNext()) {
			// All needed variables
			int num = scan.nextInt(), count = 0;
			boolean isPrime = true;

			if (num == 1 || num == 0) {
				isPrime = false;
			} else {
				// Loop through
				for (int i = 2; i < num; i++) {
					// If this is true then we can stop the loop already.
					if (num % i == 0) {
						count++;
						isPrime = false;
						i = num;
					}
				}
			}
			System.out.print("Your output: " + isPrime);
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}
	}

}
