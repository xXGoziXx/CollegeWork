public class LAB3_3 {
	public static void main(String args[]) {
		for(int x = 1;x<=10;x++) {
			System.out.println(factorial(x));
		}
	}
	public static int factorial(int num){
		int factorial = num;
		for(int i = num-1; i>0; i--) {
			factorial = factorial*i;
		} 
		return factorial;
	}
}