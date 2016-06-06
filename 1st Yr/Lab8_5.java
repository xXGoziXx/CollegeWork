public class Lab8_5{
	public static void main(String args[])
	{
		//creating string to be reverse ordered by words
		String intro = new String("My name is Aisling");
		//capitalises the first letter of each word
		String capital = new String(" ");
		intro = intro.toLowerCase();
		//adding space to make sure the first word is also included
		intro = intro + " ";
		//creating end index of each word
		int j = 0;
		//
		//loops through the string backwards
		for(int i = 0; i<intro.length(); i++)
		{
			//checks if its a new word
			if(intro.charAt(i) == ' ')
			{
				//grabs the first letter of the word
				capital = intro.substring(j,j+1);
				//capitalises the first letter of the word
				capital = capital.toUpperCase();
				//prints out words
				System.out.print(" " + capital + intro.substring(j+1, i));
				j = i + 1;
			}
		}

	}
}