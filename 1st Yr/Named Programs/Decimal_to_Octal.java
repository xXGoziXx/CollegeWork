//Through Eucladian Division
public class Decimal_to_Octal {
	public static void main (String Args[])
	{
		int x = 83;
		int octal = x%2;
		System.out.println(x);
		while(x != 0){
			octal = x%8;
			if(octal == (1|2|3|4|5|6|7)){
			x = x/8;
			}
			else{
				x = x/8;
			}
			System.out.println(x + " " + octal);
			//The answer is starting from bottom to top (couldnt figure out how to reverse it)
		}
	}
}