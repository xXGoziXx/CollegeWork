//required import files to get the user input
import java.util.Scanner;


public class Lab9_5
{
	public static void main(String args[])
	{
		//creates a scanner that gets the users input
		Scanner scan = new Scanner(System.in);
		//creates variable to store the size of the array
		int size = 0;
		//tells the user to input array size
		System.out.println("Please input the size of the array: ");
		///stores users input as the size of the array
		size = scan.nextInt();
		//declares a variable and makes the user input the size of it
		double array[] = new double[size];
		//loops through array and stores users input in the array
		for(int i = 0 ; i<array.length; i++)
		{
			//tells user to input numbers for the array
			System.out.println("Please input numbers for the array: ");
			//stores the user input as a number in the array
			array[i] = scan.nextInt();
		}
		//makes the program look nice by displaying the array :D
		System.out.println("This is your array: ");
		System.out.print("| ");

		for(int j = 0 ; j<array.length;j++)
		{
			System.out.print(array[j]+ " | ");
		}
		//ifnishes displaying the array :)


		//declares the variable to be the largest number in the array
		double lnum = array[0];
		//declares the variable to be the smallest number in the array
		double snum = array[0];
		//gets the smallest and largest number in the array
		for(int x = 0; x<(array.length - 1); x++)
		{
			//checks to see the current number in the array is:
			// larger than the previous largest number in the array
			if(lnum < array[x+1])
			{
				//stores the current number in the array which is larger
				lnum = array[x+1];
			}
			//checks to see the current number in the array is:
			// smaller than the previous smallest number in the array
			else if(snum > array[x+1])
			{
				//stores the current number in the array which is smaller
				snum = array[x+1];
			}

		}
		//prints largest number
		System.out.println("\n\nThe largest number is: " + lnum);

		//prints samllest number
		System.out.println("The smallest number is: " + snum);

	}
}