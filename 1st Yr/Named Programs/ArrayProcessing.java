import java.util.*;

public class ArrayProcessing 
{
	static int [] array2 = {0,1,2,3,4,5,6,7,8,9};
	public static void main(String args[]) {
		int[] array =  new int[100];
		int[] array1 = new int[100];
		makeIntArray(array);
		makeIntArray(array1);
		printArray(array);
		printArray(array1);
		printArray(array2);
		System.out.println("This is the dot product of array1 and array2: " + dotProduct(array, array1));
		System.out.println("This is the largest number in array2: " + findMax(array));
		System.out.println("This is the largest number in array2: " + findMax(array1));
		System.out.println("This is the largest number in array2: " + findMax());
		
	}
	public static int[] makeIntArray(int[] array) {
		for(int i = 0;i<array.length;i++){
			Random rand = new Random();
			array[i] = rand.nextInt(200);
		}
		return array;
	}
	public static void printArray(int[] array){
		System.out.print(array[0]);
		for(int i = 1;i<array.length;i++){
			System.out.print(", " + array[i]);
		}
		System.out.println(array[array.length-1] + ".");
	}
	public static int dotProduct(int[] array, int[] array1){
		int dotP = 0;
		for(int i = 0; i<array.length;i++) {
			dotP += (array[i]*array1[i]);
		}
		return dotP;
	}
	public static int findMax(int[] array) {
		int ln = array[0];
		for(int i = 0;i<array.length-1;i++) {
			if(array[i]>ln) {
				ln = array[i];
			}
		}
		return ln;
	}
	public static int findMax() {
		int ln = array2[0];
		for(int j = 0;j<array2.length-1;j++) {
			if(array2[j]>ln) {
				ln = array2[j];
			}
		}
		return ln;
	}
}