public class Week_5_4 {
	public static void main (String Args[])
	{
		int x = 100;
		if(x>=100){
			System.out.println((x/100)%10 + "\n" + (x/10)%10 + "\n" + x%10);
		}
		else if(x>=1000){
			System.out.println((x/1000)%10 + "\n" + (x/100)%10 + "\n" + (x/10)%10 + "\n" + x%10);
		}
		else{
			System.out.println("The number " + x + " does not have 3 or 4 digits.");
		}

	}
}