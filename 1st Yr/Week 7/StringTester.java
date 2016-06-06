/**
 * Write a description of class StringTester here.
 * A program that tests strings. :/
 * @author Godstime Osarobo
 * @version 1.0
 */
public class StringTester
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class StringTester
     */
    public StringTester()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * The Main Method
     * @param  args   argument
     * @return  void 
     */
    public static void main(String args[]) {
        String pal = new String("Navan");
       if(stringPal(pal)) {
           System.out.println("The string " + pal + " is a palindrome.");
        }
        else{
            System.out.println("The string " + pal + " is not a palindrome.");
        }
        
    }
    
    /**
     * Checks if a string is a palindrome
     * 
     * @param String pal
     * @return boolean  
     */
    public static boolean stringPal(String pal) {
       boolean method = false;
       String str = "";
       for(int i = pal.length()-1;i>=0; i--) {
       str = str + pal.charAt(i);
       
       }
       if(str.equalsIgnoreCase(pal)) {
           return true;
        }
        else {
            return false;
        }
    }
    
    /**
     * Checks if a string is an anagram
     * 
     * @param String str1, String str2
     * @return boolean
     */
    public static boolean anagramChecker(String str1, String str2) {
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();
        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ", "");
        StringBuilder str = new StringBuilder(str2);
        boolean found = false;
        if(str1.length() == str2.length()) {
            for(int i = 0; i<str1.length();i++) {
                    for(int j = 0; j<str1.length();j++) {
                          if(str1.charAt(i) == (str2.charAt(j))) {
                            str.setCharAt(j, '*');
                            str2 = str.toString();
                            found = true;
                            break;
                        }
                        
                    }
                    if(!found) {
                        return false;
                    }
                    else {
                        found = false;
                    }
            }
            return true;
        }
        else {
            return false;
        }
    }
    
}