import java.util.Scanner;

public class Scanner_example{
	public static void main (String args[])
	{
		String num = new String (" ");
		int len = num.length();
		Scanner sc = new Scanner(System.in);

		while(len!=12)
		{
			System.out.println("Please enter a phone number");
			num = sc.nextLine();
			len = num.length();
		}

		System.out.println("International Code: " + num.substring(0,3));
		System.out.println("Operator Code: " + num.substring(3,5));
		System.out.println("Number: " + num.substring(5));
	}
}