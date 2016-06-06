package Week5;
import java.util.*;

public class Prime_SieveMethod {
	public static void main(String args[])
	{
		Scanner scan = new Scanner(System.in);
		boolean prime[] = new boolean [scan.nextInt()];
		Arrays.fill(prime, true);
		
		for(int i = 2; i < prime.length; i++)
		{
			if(prime[i] == true && 2*i < prime.length){
				for(int j = i*i; j < prime.length; j=j+i){
					prime[j] = false;
				}
			}
		}
		
		for(int k = 2; k < prime.length; k++){
			if(prime[k] == true){
				System.out.println(k);
			}
		}
	}

}
