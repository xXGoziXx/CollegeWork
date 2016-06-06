public class Revision {
	public static void main(String args[]){
		int i = 0;
		int j = 10;
		type(30,"This is 'i'.");
		type(30,"This is 'j'.");
		System.out.println("'i' = " + i + ".");
		System.out.println("'j' = " + j + ".");
		type(30,"'i' and 'j' like being together. But they're too far apart.");
		while(!(i==j)){
			i++;
			j--;
			System.out.println("'i' = " + i + ".");
			sleep(750);
			System.out.println("'j' = " + j + ".");
		}

		type(30,"Finally!");
		sleep(750);
		type(30,"We're together.");
	}
	public static void type(long time, String text){
		for(int i = 0; i<text.length();i++){
			System.out.print(text.charAt(i));
			sleep(time);
		}
		System.out.println("");
	}

	/*
		*sleep: makes the console wait depending on the amount of miliseconds chosen
		@param long milis
		@return void
	*/
	public static void sleep(long milis) {
				try
				{
					Thread.sleep(milis);
				}
				catch(Exception ee) {}

	}
}