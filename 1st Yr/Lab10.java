//imports the file to read the users input
import java.util.Scanner;

public class Lab10
{
	public static void main(String args[])
	{
		//declares the function that scans the users input
		Scanner scan = new Scanner(System.in);
		//declares the string that will store the flight code
		String fc = new String("");
		//makes a switch that controls the program
		boolean Switch = true;
		//declares a variable that will store the flight number
		int fn = 0;
		//creates loops that goes on until "END" is inputted
		while(Switch == true)
		{
			//tries the piece of code and if it gets a string instead of an int it catches the error and carries on
			try{
				//tells the user to enter a flight code
				System.out.println("Please enter a flight code: ");
				//stores the users input
				fc = scan.nextLine();
				//changes the flight number to upper case
				fc = fc.toUpperCase();
				//checks if it is a Ryanair flight code
				if(fc.substring(0,2).equals("FR") && (fc.length()<7))
				{
					/*changes the fligth number to an int that can be checked*/
					fn = Integer.parseInt(fc.substring(2,6));
					//prints teh flight code, airline and flight number
					System.out.println("Flight Code: " + fc + "| Airline: Ryanair(" + fc.substring(0,2) + ")| Flight Number: " + fn + "|");
				}
				//checks if it is an Aer Lingus flight code
				else if(fc.substring(0,2).equals("EI") && (fc.length()<7))
				{
					/*changes the fligth number to an int that can be checked*/
					fn = Integer.parseInt(fc.substring(2,6));
					//prints teh flight code, airline and flight number
					System.out.println("Flight Code: " + fc + "| Airline: Aer Lingus(" + fc.substring(0,2) + ")| Flight Number: " + fn + "|");
				}
				//checks if it is an Air France flight code
				else if(fc.substring(0,2).equals("AF") && (fc.length()<7))
				{
					/*changes the fligth number to an int that can be checked*/
					fn = Integer.parseInt(fc.substring(2,6));
					//prints teh flight code, airline and flight number
					System.out.println("Flight Code: " + fc + "| Airline: Air France(" + fc.substring(0,2) + ")| Flight Number: " + fn + "|");
				}
				//checks if it is an American Express flight code
				else if(fc.substring(0,2).equals("AA") && (fc.length()<6))
				{
					/*changes the fligth number to an int that can be checked*/
					fn = Integer.parseInt(fc.substring(2,5));
					System.out.println("Flight Code: " + fc + "| Airline: American Express(" + fc.substring(0,2) + ")| Flight Number: " + fn + "|");
				}
				//checks if it is a Fly Be flight code
				else if(fc.substring(0,2).equals("BE") && (fc.length()<6))
				{
					/*changes the fligth number to an int that can be checked*/
					fn = Integer.parseInt(fc.substring(2,5));
					//prints teh flight code, airline and flight number
					System.out.println("Flight Code: " + fc + "| Airline: Fly Be(" + fc.substring(0,2) + ")| Flight Number: " + fn + "|");
				}
				//Checks if the input is END
				else if(fc.equals("END"))
				{
					//stops the program
					Switch = false;
				}

				else
				{
					//tells the user it is an invalid flight code
					System.out.println("code: " + fc + "| Invalid flight code.");
				}
			}
			//catches the error
			catch(java.lang.NumberFormatException e)
			{
				//tells the user the input is flight code is incorrect
				System.out.println("Code: " + fc + "| Invalid Flight Code");
			}
		}
	}
}