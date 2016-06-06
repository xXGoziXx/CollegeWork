public class Week6_5{

	public static void main(String args[])
	{
		int num = 3345, first = 0, second = 0, third = 0, fourth= 0, countNOP = 0;
		for(num = 1000; num<10000; num++ ){
				first = num / 1000 % 10;
				second = num / 100 % 10;
				third = num / 10 % 10;
				fourth = num % 10;
		 if((first==fourth)&&(second==third))
			{
				countNOP++;
				System.out.println("Palindrome: " + num + " " + "Counter: " + countNOP);
		}
	}
}
}