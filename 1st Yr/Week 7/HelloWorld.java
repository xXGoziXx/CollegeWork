/**
 * Write a description of class HelloWorld here.
 * Prints out a Hello followed by a given name.
 * @author Godstime Osarobo
 * @version 1.0 27/03/15
 */
public class HelloWorld
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class HelloWorld
     */
    public HelloWorld()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    public static void main(String args[]) {
        sayHello("Godstime");
    }
	/**
     * A Method that prints hello followed by the parameter called
     * 
     * @param  name   the name used in the method
     * @return		  void
     */
    public static void sayHello(String name){ 
        System.out.println("Hello, " + name);
    }
}