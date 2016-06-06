public class LAB2_2
{
	public static void main(String args[]) {
		int vowels = 0;
		int consonants = 0;		
		for(int i = 0;i<args[0].length()-1;i++) {
			if(args[0].substring(i,i+1).toLowerCase().equals("a")||args[0].substring(i,i+1).toLowerCase().equals("e")||args[0].substring(i,i+1).toLowerCase().equals("i")||args[0].substring(i,i+1).toLowerCase().equals("o")||args[0].substring(i,i+1).toLowerCase().equals("u")) {
				vowels++;
			}
		}
		consonants = args[0].length() - vowels;
		System.out.println("This string has " + vowels + " vowels and " + consonants + " consonants.");
		
		
	}
}