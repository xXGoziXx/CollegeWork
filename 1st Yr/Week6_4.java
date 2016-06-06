public class Week6_4{
	public static void main (String args[])
	{
		int num = 123, first = 0, second = 0, third = 0;
		if((num>=100)&&(num<1000))
		{
		first = num / 100 % 10;
		second = num / 10 % 10;
		third = num % 10;
		System.out.println("The first digit of " + num + " is: " + first);
		System.out.println("*******************************************");
		System.out.println("The second digit of " + num + " is: " + second);
		System.out.println("*******************************************");
		System.out.println("The third digit of " + num + " is: " + third);
		System.out.println("*******************************************");
		}
		else{
				System.out.println("Not a 3 digit number");
			}
	}
}