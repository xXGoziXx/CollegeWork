public class Week_5_3 {
	public static void main (String Args[])
	{
		int x = 20, y = 19, z = 19;
		if((x>18)&(y>18)&(z>18)){
			System.out.println("All people are over 18.");
		}
		else if((x>18)|(y>18)|(z>18)){
			System.out.println("At least one of the people are over 18.");
		}
		else{
			System.out.println("Not all people are over 18.");
		}
	}
}