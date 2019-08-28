import java.util.Date;

/**
 * This interface is made for Shapes Properties
 * 
 * @author Murtaza Ali
 *
 */
public interface Shape {

	/**
	 * Enum for shapes
	 * 
	 * @author Murtaza Ali
	 *
	 */
	public enum Shapetype {
		CIRCLE, RECTANGLE, SQUARE, TRIANGLE
	};

	/**
	 * @return area
	 */
	public double getArea();

	/**
	 * @return type
	 */
	public Shapetype getType();

	/**
	 * @return perimeter
	 */
	public double getPerimeter();

	/**
	 * @return origin
	 */
	public Point getOrigin();

	/**
	 * @param p
	 * @return point is inclosed or not
	 */
	public boolean isPointEnclosed(Point p);

	/**
	 * @return distance from origin
	 */
	public double getDistance();

	/**
	 * @return date and time
	 */
	public Date getTimeStamp();

}
