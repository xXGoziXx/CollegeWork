import java.util.Scanner;
import java.util.Random;

public class Arrays{
	public static void main(String args[])
	{
		int array[] = new int[9];
		Scanner sc = new Scanner (System.in);
		Random randomGenerator = new Random();
		for(int i = 0; i<array.length; i++)
		{
			int randomInt = randomGenerator.nextInt(2);
			array[i] = randomInt;
			System.out.println(array[i]);
		} //Fine!

	}
}
