public class LAB4_1
{
	public static void main (String args[]) {
		detectDuplicateLetter(args[0]);
	}
	public static void detectDuplicateLetter(String letter){
		for(int i = 0; i<letter.length()-1;i++) {
			if(letter.charAt(i) == letter.charAt(i+1)) {
				System.out.println("Duplicate letter found");
			}
			else{
				
			}
		}
	}
}