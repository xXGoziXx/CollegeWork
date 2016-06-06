public class Week6_2{
	public static void main (String args[])
	{
		int i = 1, j = 9, k = 9, l = 9;
		for(i = 1; i>=0; i--){
			if(i>0){
				System.out.println(i + "0" + "0" + "0");
			}
			else{
			for(j = 9; j>=0; j--){
				if(j>0){
				for(k = 9; k>=0; k--){
					for(l = 8; l >=0; l = l - 2){
						System.out.println(i + "" + j + "" + k + "" + l);
					}
				}
				}
				else{

				}
			}
		}
	}
	}
}