/*
 * Find the largest integer that can be created from a pair of integers and the following bit manipulation operators:
 * <<, >>, and |. Once the | operator is applied, the two inputs are consumed and cannot be referred to again.
 * So you can shift the two original integers as much as you want, then apply the | operator to yield a result.
 * 
 * Input Format:
 * The first line and second line contain two integers n1 and n2.
 * 
 * Output Format:
 * Print out the largest integer that can be created using n1 and n2 and the bit manipulation operators <<, >>, and |.
 */

package week12;
import java.util.*;
import java.io.*;

public class LabV2_BitManipulation {
	public static void main(String args[]) throws Exception{
		File input = new File(
				"C:/Users/Tomek/OneDrive/College/Year 2/Semester 1/CS210 Algorithms and Data Structures 1/CS210 Labs/src/week12/LabV2_Input.txt");
		Scanner scan = new Scanner(input);

		while(scan.hasNext()){
			int x = Integer.parseInt(scan.nextLine());
			int y = Integer.parseInt(scan.nextLine());
			int result = Integer.MIN_VALUE;

			for(int i = 0; i <= 32; i++){
				for(int j = 0; j <= 32; j++){
					if(((x<<i)|(y<<j)) > result){
						result = (x<<i)|(y<<j);
					}
					else if(((x<<i)|(y>>j)) > result){
						result = (x<<i)|(y>>j);
					}
					else if(((x>>i)|(y<<j)) > result){
						result = (x>>i)|(y<<j);
					}
					else if(((x>>i)|(y>>j)) > result){
						result = (x>>i)|(y>>j);
					}
					else {
						result = result;
					}
				}
			}
			System.out.println("Your output: " + result);
			System.out.println(scan.nextLine());
			System.out.println(scan.nextLine());
		}
	}
}
