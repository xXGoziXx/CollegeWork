public class Week6_3{
	public static void main (String args[])
	{
		int i = 1, j = 0, k=0;
		for(i=1; i<=100;i++){
			j = (i*i) + j;
			if(i%2==0){
				k = i+k;
			}
		}
		System.out.println(k);
		System.out.println(j);
	}
}