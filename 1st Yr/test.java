public class test{
	public static void main(String args[])
	{
		String intro = new String("My name is Aisling");
		intro = " " + intro;
		String section = new String(" ");
		int j = intro.length();

		for(int i = intro.length()-1; i>=0; i--)
		{

			if(intro.charAt(i) == ' ')
			{
				section = intro.substring(i, j);
				for(int k = section.length()-1; k>0;k--)
				{
					System.out.print(section.charAt(k));
				}
				System.out.println("");
				j = i;
			}

		}

	}
}