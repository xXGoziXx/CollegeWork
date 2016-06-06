/*
 * The goal is to read in a number and to output the nearest prime.
 * If two primes are equal distance to the number then output the lower one.
 * 
 * Input format:
 * An integer N
 * 
 * Output format:
 * The closest prime to N.
 */

package Week5;

import java.io.File;
import java.util.*;

public class LabV2_ClosestToPrime {
	public static void main(String args[]) throws Exception {
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week5\\LabV2_Input.txt");
		Scanner scan = new Scanner(input);
		while (scan.hasNext()) {
			// Number inputted by user
			int num = Integer.parseInt(scan.nextLine());
			// Count vars
			int count1 = 0, count2 = 0;

			// Boolean array holding true/false - SIZE MUST BE BIGGER THAN INPUT
			// (bigger by 10 is more than enough)
			boolean isPrime[] = new boolean[num + 10];
			// Fill out the array with true values
			Arrays.fill(isPrime, true);

			// Sieve method to find primes and non-primes
			for (int i = 2; i < isPrime.length; i++) {
				if (isPrime[i] == true && 2 * i < isPrime.length) {
					for (int j = i * i; j < isPrime.length; j += i) {
						isPrime[j] = false;
					}
				}
			}

			// THIS PART CHECKS FOR THE CLOSEST PRIME NUMBER TO THE INPUTTED
			// NUMBER
			// UNLESS THE INPUTTED VALUE IS ALREADY A PRIME NUMBER

			// if the user value is already a prime then just print the number
			if (isPrime[num] == true) {
				System.out.println("Your output: " + num);
			}
			// if num = not prime
			else {
				// Loop through the positive direction in the array
				// STARTING AT THE POSITION OF NUM
				for (int i = num; i < isPrime.length; i++) {
					// If value at each pos is FALSE then count how many times
					// you have to skip until you reach a TRUE value
					if (isPrime[i] == false) {
						count1++;
					}
					// eventually a TRUE value will be reached so you need to
					// exit the loop when you reach it
					else {
						i = isPrime.length;
					}
				}
				// Loop through in the negative direction in the array
				for (int i = num; i > 2; i--) {
					// if value at each pos is FALSE then count how many times
					// you have to skip until you reach a TRUE value
					if (isPrime[i] == false) {
						count2++;
					}
					// eventually a TRUE value will be reached so you need to
					// exit the loop
					else {
						i = 1;
					}
				}

				// RETURN CLOSEST TO THE NUM
				// If count1>count2 then the number is above the inputted value
				if (count1 > count2) {
					System.out.println("Your output: " + (num - count2));
				}
				// if both counts are equal then give the one that is first on
				// the list
				else if (count1 == count2) {
					System.out.println("Your output: " + (num - count2));
				}
				// if count1<count2 then the number is the closer number is
				// lower on the list
				else {
					System.out.println("Your output: " + (num + count1));
				}
			}
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
			
		}

	}

}
