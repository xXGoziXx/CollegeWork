import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tc = scan.nextInt();
        long st = 0,sf = 0,sft = 0,an = 0,ts = 0;//st = sum of 3, sf = sum of 5, sft = sum of 15, an = array number, ts = total sum
        long [] array = new long[tc];
        //loops through array of numbers to store input
        for(int i = 0;i<array.length;i++){
            array[i] = scan.nextInt();
        }
        //loops through to find sum
        for(int j = 0;j<array.length;j++){
            an = array[j] - 1;
            if(((an%3)==0)&&((an%5)==0)){
                st = ((an/3)*(3+an))/2;
                sf = ((an/5)*(5+an))/2;
				sft = ((an/15)*(15+an))/2;
                ts = (sf + st)-sft;
                System.out.println(ts);
            }
            else if((an%3)==0){
				st = ((an/3)*(3+an))/2;
				while((an%5)!= 0){
					an--;
					if((an%5) == 0){
						sf = ((an/5)*(5+an))/2;
					}
				}
				an = array[j] - 1;
				while((an%15)!= 0){
					an--;
					if((an%15) == 0){
						sft = ((an/15)*(15+an))/2;
					}
				}
				ts = (sf + st) - sft;
				System.out.println(ts);
			}
			else if((an%5)==0){
				sf = ((an/5)*(5+an))/2;
				while((an%3)!= 0){
					an--;
					if((an%3) == 0){
						st = ((an/3)*(3+an))/2;
					}
				}
				an = array[j] - 1;
				while((an%15)!= 0){
					an--;
					if((an%15) == 0){
						sft = ((an/15)*(15+an))/2;
					}
				}
				ts = (sf + st) - sft;
				System.out.println(ts);
			}
			else if((an == 2) || (an == 1)){
				System.out.println(0);
			}
			else{
				while((an%3)!= 0){
					an--;
					if((an%3) == 0){
						st = ((an/3)*(3+an))/2;
					}
				}
				an = array[j] - 1;
				while((an%5)!= 0){
					an--;
					if((an%5) == 0){
						sf = ((an/5)*(5+an))/2;
					}
				}
				an = array[j] - 1;
				while((an%15)!= 0){
					an--;
					if((an%15) == 0){
						sft = ((an/15)*(15+an))/2;
					}
				}
				ts = (sf + st) - sft;
				System.out.println(ts);
			}
        }
    }
}
