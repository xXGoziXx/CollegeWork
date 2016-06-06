public class Lab5_2 {
	public static void main (String args[])
	{
		int count = 1, x = 0;
		while(count <= 50){
			x = x + count;
			count = count +2;

		}
		System.out.print("The sum of the odd numbers from 0 to 50 inclusive is: " + x);
	}
}