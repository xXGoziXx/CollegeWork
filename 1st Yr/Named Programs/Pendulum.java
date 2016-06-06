//import the scanner which reads in the input of the user
import java.util.Scanner;

public class Pendulum
{
	public static void main(String args[])
	{
		//declares the scanner method
		Scanner scan = new Scanner(System.in);
		//creates the variables of length(l), period(T), pi, and gravity(g)
		double l = 0, T = 0, g = 9.81, pi = Math.PI;
		//tells the user to enter a length for the formula
		System.out.println("Please the length of the Pendulum: ");
		//stores the users input as the variable for length
		l = scan.nextInt();
		//gets the period using the formula and variables
		T = (2*pi)*Math.pow((l/g),(0.5));
		//prints out the users input for the length and the result of period
		System.out.println("Length: " + l + "| Period: " + T + "|");
	}
}