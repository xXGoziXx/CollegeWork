//Maths Tables
//***********
// *       *
// *       *
// *       *
// *       *

public class Week7_3 {
	public static void main (String args[])
	{
		for(int i = 1; i<=12;i++)
		{
			System.out.println(i + " times tables: ");
			for(int j  = 0 ; j<=12; j++)
			{
				System.out.println(i + " * " + j + " = " + i*j);
			}
			System.out.println(" ");
			System.out.println("* * * * * * * * * * ");
		}
	}
}