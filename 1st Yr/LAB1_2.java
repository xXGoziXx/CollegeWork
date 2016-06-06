import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
//Bubble Sort Array
public class LAB1_2
{
	public static void main(String args[])
	{
		NumberFormat round = NumberFormat.getNumberInstance();
		round.setRoundingMode(RoundingMode.HALF_UP);
        round.setMinimumFractionDigits(0);
        round.setMaximumFractionDigits(2);
		Random rand = new Random();
		float temp = 0.0f;
		int swap = 0, comparison = 0, pass = 0;
		float[] array = /*{1.0f,2.0f,3.0f,4.0f,5.0f,6.0f,7.0f,8.0f,9.0f,10.0f,11.0f,12.0f,13.0f,14.0f,15.0f,16.0f,17.0f,18.0f,19.0f,20.0f}*/new float[20];
		for(int i = 0;i<array.length; i++)
		{
			array[i] = 100*rand.nextFloat();
			//System.out.println(round.format(array[i]));
		}
		System.out.print("Array: ");
		for(int j = 0;j<array.length; j++)
		{
			System.out.print(round.format(array[j]) + ",");
		}
		System.out.println();
		for(int BSort = 1; BSort<array.length; BSort++)//pass
		{
			System.out.print("Pass: " + (BSort) + "| ");
		for(int x = 0; x<array.length-1;x++)
		{
			comparison++;
			if(array[x]>array[x+1])
			{
				swap++;
				temp = array[x];
				array[x] = array[x+1];
				array[x+1] = temp;
			}

			System.out.print(round.format(array[x]) + ",");
		}
		System.out.println( round.format(array[array.length-1]) + "|");
		pass = BSort;
		}
		System.out.println("Passes: " + pass + "\nSwaps: " + swap + "\nComparison: " + comparison);
	}
}