//imports the required file to get the user's input
import java.util.Scanner;

public class Lab9_1
{

	public static void main(String args[])
	{
		//declares a variable to store the name
		String name = new String(" ");
		//creates a scanner to get the users input
		Scanner scan = new Scanner(System.in);
		//asks the user to enter their name
		System.out.println("Please enter your name: ");
		//stores the users input as their name
		name = scan.nextLine();

		//loops throught their name
		for(int i = 0; i<name.length(); i++)
		{
			//prints out each character of their name
			System.out.println(name.charAt(i));
		}

	}
}
