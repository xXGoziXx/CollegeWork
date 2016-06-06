//This program solves numbers to the power of a number e.g. 2^2=4.... without using math.pow(int,int)
public class Exponential_Program {
	public static void main (String Args[])
	{
		//input your values
		int number = 2, power = 8;

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