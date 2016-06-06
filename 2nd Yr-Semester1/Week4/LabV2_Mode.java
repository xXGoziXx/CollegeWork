/*
 * The goal is to read in a list of integers into an array and output the one which occurs most frequently.
 * If there are two or more values that occur most frequently then choose the one which was earlier in the list.
 * 
 * Input format:
 * The first line contains N, the number of inputs.
 * The second line contains N integers separated by a space.
 * 
 * Output format:
 * The mode, that is, the number which occurs most frequently in the list.
 */

package Week4;
import java.util.*;

public class LabV2_Mode {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		int array[] = new int[scan.nextInt()];
		for(int i = 0; i< array.length; i++)
		{
			array[i] = Integer.parseInt(scan.next());
		}
		
		int count = 0, countFinal = 0, answer = array[array.length-1];
		for(int i = array.length-1 ; i > -1; i--)
		{
			count = 0;
			for(int j = array.length-1; j > -1; j--)
			{
				if(array[i] == array[j])
				{
					count++;
				}
			}
			if(count >= countFinal)
			{
				countFinal = count;
				answer = array[i];
			}
		}
		System.out.println(answer);
		
	}

}
