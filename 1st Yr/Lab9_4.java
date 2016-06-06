//required Random import file
import java.util.Random;


public class Lab9_4
{
	public static void main(String args[])
	{
		//create array
		int array[] = new int [10];
		//varibale to calculate sum for average
		int sum = 0;
		//random number generator
		Random r = new Random();
		//loop that inputs random numbers to array
		for(int i = 0 ; i<array.length; i++ )
		{
			//creates random number and stores it in position i of array
			array[i] = r.nextInt(1000);
			//prints array numbers
			System.out.print(array[i] + " ");
			//gets the sum of the numbers
			sum = sum + array[i];
		}
		//uses sum to get the average of the numbers in the array
		int average = sum / array.length;
		//prints average of the numbers in the array
		System.out.println("\n" + "The average of the numbers in the array is: " + average);
	}
}