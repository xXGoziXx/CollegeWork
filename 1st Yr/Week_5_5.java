public class Week_5_5 {
	public static void main (String Args[])
	{
		//using for
		System.out.println("This is the for way...");
		for(int i=50; i<=150; i=i+3){
			System.out.println(i);
		}
		System.out.println("...or you could do this...");
		//using while
		int i = 50;
		while(i<=150){
			System.out.println(i);
			i=i+3;
		}
		System.out.println("...that was the while way.");
	}
}