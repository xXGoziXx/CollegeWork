/**
 * This is a Point Object class
 *
 * @author Godstime Osarobo
 * @version 3.0 24/04/2015
 */
 import java.util.*;
 import java.math.*;
 
public class Point
{
    // instance variables - replace the example below with your own
    private double X;
	private double Y;

    /**
     * Constructor for objects of class Point
     */
    public Point()
    {
        // initialise instance variables
        this.X = 0.0;
		this.Y = 0.0;
    }
	public Point(double X, double Y){
		this.X = X;
		this.Y = Y;
	}
    /**
     *setX - change the X coordinate
     * 
     * @param  X
     * @return     void
     */
    public void setX(double X)
    {
        // put your code here
        this.X = X;
    }
	/**
     *setY - change the Y coordinate
     * 
     * @param  Y
     * @return     void
     */
    public void setY(double Y)
    {
        // put your code here
        this.Y = Y;
    }
	/**
     *getX - change the X coordinate
     * 
     * @param    void
     * @return     double
     */
    public double getX()
    {
        // put your code here
        return this.X;
    }
	/**
     *getY - change the Y coordinate
     * 
     * @param    void
     * @return   double
     */
    public double getY()
    {
        // put your code here
        return this.Y;
    }
	/**
     *getDistance - find the distance
     * 
     * @param    p
     * @return   double
     */
    public double getDistance(Point p)
    {
		double X = this.X;
		double Y = this.Y;
		double Px = p.getX();
		double Py = p.getY();
        // put your code here
        return Math.sqrt(Math.pow((X - Px),2)+Math.pow((Y - Py),2));
    }
	public static double getDistance(Point a, Point b){
		double aX = a.getX();
		double aY = a.getY();
		double bX = b.getX();
		double bY = b.getY();
        // put your code here
        return Math.sqrt(Math.pow((aX - bX),2)+Math.pow((aY - bY),2));
	}
}
