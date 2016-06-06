package Week2;

import java.util.Scanner;

public class lcm {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int lcm = 0;
		
		
		for(int i = 1; i <= x*y; i++){
			for(int j = 1; j <= x*y; j++){
				if(x*i == y*j){
					lcm = x*i;
					j = (x*y)+1; // update so that we exit the inner loop
					i = (x*y)+1; // udpate so that we exit the outer loop
				}
			}
		}
		System.out.println(lcm);
		
		
	}
}
