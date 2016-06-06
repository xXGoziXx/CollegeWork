import java.util.*;//importing scanner


public class LAB1_1
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);//creating scanner
		int array[] = new int[10];//creating array
		boolean error = false;

		for(int i = 0; i<array.length;i++)//looping through the array to fill array with user input
		{
			do{
				try
				{
					error = false;
					scan = new Scanner(System.in);//creating scanner
					System.out.println("Please enter an integer to put into the array.");
					array[i] = scan.nextInt();

				}
				catch(InputMismatchException e)
				{
					error = true;
					System.out.println("Invalid Input!");
					scan.nextLine();
				}
				}
			while(error==true);
		}
		int lnum = array[0];//creating largest number variable
		for(int x = 1; x<array.length;x++)//looping through the array to search for the largest number
		{
			if(array[x]>lnum)
			{
				lnum = array[x];
			}
		}
		System.out.println("The largest number in the array is " + lnum);//printing out largest number
	}
}