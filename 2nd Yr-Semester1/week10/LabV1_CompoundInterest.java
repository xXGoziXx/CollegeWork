/*
 * Write a recursive method that takes in a bank account balance x, an interest rate i and a number of years y,
 * and outputs how much the bank account will be worth after y years.
 * For example, if you invest €100 at 2% annual interest, then after year 1 you have €102.00,
 * after year 2 you have €104.04, after year 3 you have €106.12 and so forth.
 * 
 * Input Format:
 * The main method, which is already written, takes in a bank account balance as a double, x,
 * interest percentage rate as a double, i, and the number of years for which it is being invested, y.
 * 
 * Output Format:
 * A double representing how much the bank account is worth after y years, correct to two decimal places.
 */

package week10;
import java.util.*;
import java.io.*;

public class LabV1_CompoundInterest {
	public static void main(String args[]) throws Exception{
		File input = new File(
				"C:\\Users\\Tomek\\OneDrive\\College\\Year 2\\Semester 1\\CS210 Algorithms and Data Structures 1\\CS210 Labs\\src\\Week10\\LabV1_Input.txt");
		Scanner scan = new Scanner(input);
		
		while(scan.hasNext()){
			int y = Integer.parseInt(scan.nextLine());
			double i = Double.parseDouble(scan.nextLine());
			double x = Double.parseDouble(scan.nextLine());
			System.out.println(String.format( "%.2f", compound(y,i,x)));
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}
	}

	public static double compound(int y, double i, double x){
		if(y == 0){
			return x;
		}
		int one = y-1;
		double two = i;
		double three = x;
		double factor = 1.0+(two/100);


		return factor*compound(one, two, three);
	}

}
