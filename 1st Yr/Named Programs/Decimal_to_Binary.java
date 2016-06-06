//Through Eucladian Division
public class Decimal_to_Binary {
	public static void main (String Args[])
	{
		int x = 13;
		int binary = x%2;
		System.out.println(x);
		while(x != 0){
			binary = x%2;
			if(binary == 1){
			x = x/2;
			}
			else{
				x = x/2;
			}
			System.out.println(x + " " + binary);
			//The answer is starting from bottom to top (couldnt figure out how to reverse it)
		}

	}
}