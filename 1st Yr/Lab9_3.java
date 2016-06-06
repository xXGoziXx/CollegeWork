//imports the required file to get the user's input
import java.util.Scanner;

public class Lab9_3
{
	public static void main(String args[])
	{
		//creates a scanner to get the users input
		Scanner scan = new Scanner(System.in);
		//creates string that will collect users input
		String input = new String("");
		//tells the user to enter a text
		System.out.println("Please enter a piece of text: ");
		//store the users input
		input = scan.nextLine();
		//input = input.toLowerCase;
		//creates a string that will reverse the input
		String reverse = new String("");
		//creates a varibale that stores the length of the input
		int len = input.length();

		//loops through input backwards
		for(int i = len -1; i>=0; i--)
		{
			//stores the letters in input backwards
			reverse = reverse + input.charAt(i);
		}

		//checks to see if input equals reverse
		if(input.equals(reverse))
		{
			//If it is, it tells the user it's a palindrome
			System.out.println("Your text is a palindrome");
		}
		else
		{
			//If it is not, it tells the user it's not a palindrome
			System.out.println("Your text is not a palindrome");
		}
	}
}