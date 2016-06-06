package Week4;
import java.util.*;

public class Practice {

	 public static void main(String args[] ){
		 	
		 //Initialise variables
	        Scanner in = new Scanner(System.in);
	        int sum = 0, ans = 0, tempInt = 0;
	        double avg = 0, tempDouble = 0;
	        
	        //Type size of array
			System.out.println("Size of array:");
	        int array[] = new int[in.nextInt()];

	        //Values in array
			System.out.println("Values in array:");
	        for(int i = 0; i < array.length; i++)
	            {
	            array[i] = in.nextInt();
	            //Getting the sum of array
	            sum = sum + array[i];

	        }
	        
	        //Sorting array
	        for(int i = 0; i < array.length-1; i++)
	            {
	            if(array[i]>array[i+1])
	                {
	                tempInt = array[i];
	                array[i] = array[i+1];
	                array[i+1] = tempInt;

	            }
	            //Printing out the array
	            System.out.print(array[i] + " ");
	        }
	        //Empty line
			System.out.println();

			//Calculating the average
	        avg = (double)sum/(double)array.length;
	        
	        //Printing out the sum and average
			System.out.println("Sum is: " + sum);
			System.out.println("Average is: " + avg);
			
			//Initialise double array to hold the differences
	        double diff[] = new double[array.length];
	        
	        //Loop through and save the differences
	        for(int i =0; i<diff.length; i++)
	        {
	        	diff[i] = array[i]-avg;
	        	
	        	System.out.print(diff[i] +" ");
	        }

	        //
	        for(int i = 0; i < diff.length-1; i++)
	            {
	            if(diff[i]> diff[i+1])
	                {
	                tempDouble = diff[i+1];
	            }

	        }
	        for(int i = 0; i < diff.length-1; i++)
	        {
	        	if(diff[i] < diff[i+1])
	        	{
	        		ans = array[i];
	        	}
	        }

	        System.out.println("\nClosest number with the smallest difference: " + ans);

	    }
}
