public class Infinity_Loop{
	public static void main (String args[])
	{
		//input your values
		int number = 10, power = 1;

		int result = number, x = number;

		//runs the exppnential function
		while(result>0){
		for(int i = 1; i<power; i++){

			x = result*number;
			result = x;

		}
		//prints result
		System.out.println(result);
		power++;
	}

	}
}