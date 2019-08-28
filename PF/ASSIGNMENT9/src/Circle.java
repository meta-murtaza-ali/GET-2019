import java.util.Date;

/**
 * Circle class implements Shape interface
 * 
 * @author Murtaza Ali
 *
 */
public class Circle implements Shape {
	private double radius;
	private double area;
	private Point point;
	private double perimeter;
	private Date timeStamp;

	public Circle(double Radius, Point origin, Date timeStamp) {
		this.radius = Radius;
		this.point = origin;

	}

	/*
	 * calculate the area of the Circle
	 */
	public double getArea() {
		area = 3.14 * (radius * radius);
		return area;
	}

	/*
	 * return Shapetype
	 */
	public Shapetype getType() {

		return Shapetype.CIRCLE;
	}

	/*
	 * return parameter of the circle
	 */
	public double getPerimeter() {
		perimeter = 2 * 3.14 * radius;
		return perimeter;
	}

	/*
	 * return origin point
	 */
	public Point getOrigin() {
		return point;
	}

	/**
	 * to check for a point is enclosed in shape
	 * 
	 * @param, point to check
	 * @return true if enclosed, false otherwise
	 */
	public boolean isPointEnclosed(Point p) {
		double Difference = Math.sqrt(Math.pow(
				(point.getxDirection() - p.getxDirection()), 2)
				+ Math.pow((point.getyDirection() - p.getyDirection()), 2));
		if (Difference > radius) {
			return false;
		}
		return true;
	}

	/*
	 * return distance from the origin
	 */
	public double getDistance() {
		double Distance = Math.sqrt((Math.pow(point.getxDirection(), 2))
				+ Math.pow(point.getyDirection(), 2));
		return Distance;
	}

	/*
	 * return time stamp of the point
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

}
