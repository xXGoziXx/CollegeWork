import java.util.Scanner;

public class Lab10_2 {
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);

		int tFree = 0;
		int t = 15;
		int age = 0;
		String input = new String ("");

		System.out.println("Please your age: ");
		age = scan.nextInt();
		 if((age>65)||(age<12))
		 {
		 	System.out.println("Age: " + age + "| Ticket Price: €" + tFree + "|");
		 }
		 else
		 {
		 	System.out.println("Age: " + age + "| Ticket Price: €" + t + "|");
		 }
	}
}