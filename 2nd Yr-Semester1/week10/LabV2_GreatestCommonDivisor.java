/*
 * Euclid's algorithm is the oldest algorithm ever written down. 
 * It is named after the ancient Greek mathematician Euclid, who first described it in his Elements around 300 BC. 
 * It involves a recursive algorithm for deriving the Greatest Common Divisor (GCD) of a pair of numbers. 
 * Let the first number be x and the second number be y. If either x or y is a zero, then the GCD is the other number. 
 * Otherwise the GCD of (x, y) is equal to that of (y , x modulo y). 
 * 
 * Input Format:
 * A pair of integers x and y
 * 
 * Output Format:
 * An integer which is the GCD of x and y
 */

package week10;
import java.util.*;
import java.io.*;

public class LabV2_GreatestCommonDivisor {
	public static void main(String args[]) throws Exception{
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week10\\LabV2_Input.txt");
		Scanner scan = new Scanner(input);
		
		while(scan.hasNext()){
		System.out.println("Your output: " + gcd(Integer.parseInt(scan.nextLine()),Integer.parseInt(scan.nextLine())));
		System.out.println(scan.nextLine());
		System.out.println(scan.nextLine());
		}
	}
	
	public static int gcd(int x, int y){
		if(x == 0 || y == 0) 
			//Because one of them is 0 anyway
			return x+y;
		else
			return gcd(y, x%y);
	}

}
