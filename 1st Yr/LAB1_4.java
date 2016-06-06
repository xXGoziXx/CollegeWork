import java.util.*;
import java.math.*;
//Guess the number game
public class LAB1_4
{
	public static void main(String args[])
	{
		Scanner scan  = new Scanner (System.in);
		Random rand = new Random();
		int gn = 0;
		int temp = 0;
		String answer = new String ("");
		boolean swapstat= false;
		int array[] = new int[10];
		int array1[] =new int[10];
		System.out.print("Array: ");

		for(int i = 0; i<array.length-1; i++)
		{
			array[i] = rand.nextInt(50)+1;
			System.out.print(array[i] + ", ");
		}
		System.arraycopy(array, 0, array1, 0, 10);
		System.out.println();
		int high = array.length-1, low = 0, middle=0;
		for(int BSort = 1; BSort<array.length; BSort++)//pass
		{
		for(int x = 0; x<array.length-1-BSort;x++)
		{
			if(array[x]>array[x+1])
			{
				temp = array[x];
				array[x] = array[x+1];
				array[x+1] = temp;
				swapstat  = true;
			}

		}

		if(!swapstat){
			break;
		}
		swapstat = false;
		}
		/*System.out.print("Array: ");
		for(int j = 0; j<array.length-1; j++)
		{
			System.out.print(array[j] + ", ");
		}*/
		System.out.println();
		System.out.println("Pick a number from the array: ");
		gn = scan.nextInt();
		scan.nextLine();
 		boolean found = false;
		 while(low<=high&&!found)
 			{
			 middle= (high+low)/2;
			 System.out.println("Is your number higher, lower or correct? " + array[middle]);
			 answer = scan.nextLine();
			 answer = answer.toLowerCase();
			 if(answer.equals("lower"))// search in the lower space
			 {high = middle-1;}
			 else if (answer.equals("higher"))// search the higher space
			 {low = middle+1;}
 			else {
 				for(int y = 0;y<array1.length;y++)
 				{
 					if(array1[y] == array[middle])
 					{
 						middle = y;
 					}
 				}
 			System.out.println(gn + " found at position " + middle);
			 found = true;
 			}
		 }
 		if(!found)
 		{System.out.println( gn + " was not found in the list");}

	}
}