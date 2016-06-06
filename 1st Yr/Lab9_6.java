//required import files to get the user input
import java.util.Scanner;

public class Lab9_6
{
	public static void main(String args[])
	{
		//creates an array of size 10
		int array[] = new int[10];
		//creates the first even number after 20
		int number = 22;
		//creates a variable to store the users input
		int input = 0;
		//creates a scanner that gets the users input
		Scanner scan = new Scanner(System.in);

		//loops through the array
		for(int i = 0; i<array.length; i++)
		{
			//stores the value of number in the array
			array[i] = number;
			//stores the next even number as number
			number = number + 2;
		}

			//creates loop that stops when the input is -1
			while(input != -1)
			{

				//tells the user to enter a number between 0-9(which are the boundaries of the array)
				System.out.println("\nPlease enter a number from 0 - 9 to recieve the position of that number in the array: ");
				//stores the users input
				input = scan.nextInt();
				if(input == -1)
				{
					System.out.println("\nExiting...");
					input = -1;
				}
				else if((input>9)||(input<0))
				{
					System.out.println("That is not a number from 0-9. Please try again.");
					System.out.println("\nEnter -1 to end the program.\n");
				}
				else
				{
					System.out.println("This is the number at positon " + input + " in the array: " + array[input]);
					System.out.println("\nEnter -1 to end the program.\n");
				}
			}

	}
}