public class Lab8_1 {
	 public static void main(String args[])
	 {
	 	//declares the two strings
	 	String word1 = new String("Hello"), word2 = new String("World");
		int Switch = 0;
		//figures ot whether or not the strings are of the same length
	 	if(word1.length() == word2.length()){
	 		System.out.println("These strings are the same length.");
	 		for(int i = 0; i<(word1.length()|word2.length()); i++)
	 		{
	 			//switches from one string to the other and prints out the characters
	 			if(Switch == 0){
	 				System.out.print(word1.substring(i,(i+1)));
	 				Switch++;
	 			}
	 			else if(Switch == 1){
	 				System.out.print(word2.substring(i,(i+1)));
	 				Switch--;
	 			}
	 		}

	 	}
	 	else{
	 		System.out.println("These strings are not the same length.");
	 	}

	 }
}