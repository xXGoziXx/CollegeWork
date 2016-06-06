import java.util.Scanner;

public class Lab9_2
{
	public static void main(String args[])
	{
		//creates the required variables
		int number = 0, power = 0;
		//creates the scanner to get the user input
		Scanner scan = new Scanner(System.in);
		//asks for user's input
		System.out.println("Please enter your number: ");
		//stores the number input
		number = scan.nextInt();
		//asks again for user's input
		System.out.println("Now enter the power you want: ");
		//stores the power input
		power = scan.nextInt();
		// creates variable that stores result
		int result = number, x = number;

		//runs the exppnential function
		for(int i = 1; i<power; i++){

			x = result*number;
			result = x;

		}
		//prints result
		System.out.println(number + "^" + power + " = " + result);
	}
}
