/*
 * The goal is to read in a number N and output the Nth prime number.
 * For example, if N is 3, then output 5 because 5 is the third prime number.
 * 
 * Input format:
 * An integer N.
 * 
 * Output format:
 * The Nth prime number.
 */

package Week5;
import java.util.*;
import java.io.*;
import java.lang.reflect.Array;

public class LabV1_NthPrimeNumber {
	public static void main(String args[]) throws Exception{		
		Scanner scan=new Scanner(System.in);
		int nth = scan.nextInt();
		int num=1;
		int count=0;
		int i;
		while (count < nth)
		{
			num++;			
			for ( i = 2; i <= num; i++)
			{
				if (num % i == 0)
				{
					break;
				}
			}

			if ( i == num)
			{
				count++;
			}
			
			
		}
		System.out.println(num);
	}
}
