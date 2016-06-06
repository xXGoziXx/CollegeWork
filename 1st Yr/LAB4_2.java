public class LAB4_2 
{
	public static void main(String args[]) {
		detectPalindrome(args[0]);
	}
	public static void detectPalindrome(String pal) {
		int start = 0;
		int end = pal.length()-1;
		while(start<end){
			if(pal.charAt(start) != pal.charAt(end)){
				
			}
			else {
				System.out.println("Palindrome identified");
				break;
			}
			start++;
			end--;
		}
	}
}