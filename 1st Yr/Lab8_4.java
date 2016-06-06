public class Lab8_4{
	public static void main(String args[])
	{
		//creating string to be reverse ordered by words
		String intro = new String("My name is Aisling");
		//adding space to make sure the first word is also included
		intro = " " + intro;
		//creating end index of each word
		int j = intro.length();
		//
		//loops through the string backwards
		for(int i = intro.length()-1; i>=0; i--)
		{
			//checks if its a new word
			if(intro.charAt(i) == ' ')
			{
				//prints out words
				System.out.println(intro.substring(i, j));
				j = i;
			}
		}

	}
}