/**
 * This is a Point Object class
 *
 * @author Godstime Osarobo
 * @version 3.0 24/04/2015
 */
public class PointTest
{
   public static void main(String args[]){
   	Point home = new Point(12.0,24.0);
   	Point school = new Point(24.0,12.0);
	Point point = new Point();
	System.out.println(home.getX());
	System.out.println(home.getY());
	school.setX(48.0);
	school.setY(24.0);
	System.out.println(point.getDistance(home));
	System.out.println(home.getDistance(home,school));
	
	
   }
}
