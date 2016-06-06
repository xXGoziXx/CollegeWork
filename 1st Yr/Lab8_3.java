public class Lab8_3{
	public static void main(String args[])
	{
		//creating string to be reverse ordered by letters
		String intro = new String("My name is Aisling");
		//adding space to make sure the first word is also included
		intro = " " + intro;
		//creating a string that will become each word
		String section = new String(" ");
		//creating end index of each word
		int j = intro.length();

		//loops through the string backwards
		for(int i = intro.length()-1; i>=0; i--)
		{
			//checks if its a new word
			if(intro.charAt(i) == ' ')
			{
				//stores the new word
				section = intro.substring(i, j);
				//reverses the new word
				for(int k = section.length()-1; k>0;k--)
				{
					//prints the word backwards
					System.out.print(section.charAt(k));
				}
				//goes down to the next line
				System.out.println("");
				j = i;
			}

		}

	}
}