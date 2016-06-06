public class LAB5_6 {
	public static void main(String args[]) {
		vowel("antelope");
	}
	public static void vowel(String word) {
		int nvowel = 0;
		for(int i = 0;i<word.length();i++) {
			if(word.charAt(i) == 'a'||word.charAt(i) == 'e'||word.charAt(i) == 'i'||word.charAt(i) == 'o'||word.charAt(i) == 'u') {
				System.out.println(word.charAt(i));
			}
			else {
				nvowel++;
			}
		}
		System.out.println(nvowel);
	}
}