/**
 * This is an AckermannTest class
 *
 * @author Godstime Osarobo
 * @version 3.0 29/04/2015
 */
public class AckermannTest
{
    public static void main(String args[]) {
    	for(int m = 0;m<=3;m++){
				for(int n = 0;n<=12; n++){
					System.out.println("Ackermann Test: " + Ackermann(m,n));
				}
    	}
	}
	public static int Ackermann(int m, int n){
		if(m<0||n<0){
			return 0;
		}
		else if(m==0){
			return n+1;
		}
		else if((m>0)&&(n==0)){
			return Ackermann(m-1,1);
		}
		else if((m>0)&&(n>0)){
			return Ackermann(m-1,Ackermann(m,n-1));
		}
		else{
			return 0;
		}
	}
}
