public class Fibonacci {
	public static void main(String args[]){
		//iterative fast
		for(long n = 0;n<=50;n++){
			System.out.println("THIS IS FIBONACCI " + Fib(n));
		}
		//recursive slow
		for(long m = 0;m<=50;m++){
			System.out.println("THIS IS FIBONACCI " + Fibonacci(m));
		}
	}
	public static long Fibonacci(long n){
		if(n <2){
			return n;
		}
		else if(n == 2){
			return 1;
		}
		else{

			return Fibonacci(n-1) + Fibonacci(n-2);
		}
	}

	public static long Fib(long n){
		long x = 0,y = 1,z = 1;
		if(n<2){
			return n;
		}
		else if(n == 2){
			return 1;
		}
		else{
			for(long i = 2;i<n;i++){
				x = y;
				y = z;
				z = x+y;
			}
			return z;
		}
	}
}