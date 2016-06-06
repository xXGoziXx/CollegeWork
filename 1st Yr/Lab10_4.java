import java.util.Scanner;

public class Lab10_4
{
	public static void main (String args[])
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input a number:" );
		int Pcounter = 2;
		boolean Switch = false;
		int input = scan.nextInt();
		if(input%2 == 0)
		{
			System.out.println("The number " + input + " is even." );
		}
		else
		{
			System.out.println("The number " + input + " is odd.");

		}
		while(Pcounter<= input/2)
		{
			if (input % Pcounter == 0)
			{
				Switch = true;
			}
			Pcounter++;

		}
		if(Switch == true)
		{
			System.out.println("Number: " + input + " is Not Prime.");
		}
		else
		{
			System.out.println("Number: " + input + " is Prime.");
		}
	}
}