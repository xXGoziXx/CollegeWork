package week10;

public class Recursion_Examples {
	public static void main(String args[]){
		//factorial example
		System.out.println("Factorial: " + fact(7));
		//triangle example
		System.out.println("Triangle: " + triangle(5));
		//modulus example
		System.out.println("Modulus: " + modulus(20,3));
		//palindrome example
		System.out.println("Palindrom: " + palindrome("a"));
	}

	//MODULUS (%) ---- ********** NOT IN THE NOTES ********** 
	public static int modulus(int num, int divisor){
		if(num < divisor){
			return num;
		}
		else{
			return modulus(num - divisor, divisor);
		}
	}

	//FACTORIAL
	public static long fact(int num){
		if(num == 0 || num == 1){
			return 1;
		}
		else{
			return (num*fact(num-1));
		}
	}
	//TRIANGLE
	public static long triangle(int num){
		if(num == 1){
			return 1;
		}
		else{
			return num+triangle(num-1);
		}
	}

	//PALINDROME
	public static String palindrome(String word){
		if(word.length() < 2){
			return "TRUE";
		}
		else if(word.charAt(0) != word.charAt(word.length()-1))
		{
			return "FALSE";    
		}
		else {
			String newString = word.substring(1, word.length()-1);
			return palindrome(newString);
		}
	}
}

