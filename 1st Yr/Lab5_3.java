public class Lab5_3{
	public static void main (String args[])
	{
		int count = 200;
		while(count<=500){
			if(((count%7)==0)&&((count%5)==0)){
				System.out.println(count + " is a multiple of 5 and 7");
				}
				else if(((count%7)==0)||((count%5)==0)){
				System.out.println(count + " is a multiple of 5 or 7");
				}
				count++;
		}
	}
}