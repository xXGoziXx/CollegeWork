public class practice {
	public static void main(String args[]) {
		System.out.println(factorial(3));
	}
	public static int factorial(int x){
		if(x == 0){
			return 1;
		}
		else{
			return factorial(x-1)*x;
		}
	}
}