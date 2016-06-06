public class Lab8_2{
	public static void main(String args[])
	{
		//creating string
		String string1 = new String("bond antelope apple");
		//creating counter to work out how many 'a's there are
		int count = 0;
		//a char that stores the letters of the string one by one
		char stringChecker = 's';
		//a char that stores the letter we're looking for
		char letterChecker = 'a';
		//loops through string1
		for(int i = 0; i<string1.length();i++)
		{
			//stores each letter of string1 one by one
			stringChecker = string1.charAt(i);
			//increases the counter by one if the letter is found
			if(stringChecker == letterChecker)
			{
				count++;
			}
		}
		//changes the letter to '*' if there are more than 3
		if(count >= 3)
		{
			string1 = string1.replace('a', '*');

		}
		//changes the letter to '%' if there are less than 3
		else if(count<3){
			string1 = string1.replace('a', '%');
		}
		//prints out the end result
		System.out.println(string1);
	}
}