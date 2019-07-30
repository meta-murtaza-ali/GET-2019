import java.util.Date;

/**
 * Rectangle class implements Shape interface
 * @author Murtaza Ali
 *
 */
public class Rectangle implements Shape {
	private double length;
	private double breadth;
	private double area;
	private double perimeter;
	private Point point;
	private Date timeStamp;

	public Rectangle(double Length, double Breadth, Point origin, Date timeStamp) {
		this.length = Length;
		this.breadth = Breadth;
		this.point = origin;
		this.timeStamp = new Date();
	}

	/*
	 * return Shapetype
	 */
	public Shapetype getType() {

		return Shapetype.RECTANGLE;
	}
	
	/*
	 * return parameter of the rectangle
	 */
	public double getPerimeter() {
		perimeter = 2 * length * breadth;
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
	 * @param, point to check
	 * @return true if enclosed, false otherwise
	 */
	public boolean isPointEnclosed(Point p) {
		if (point.getxDirection() < p.getxDirection()
				&& p.getxDirection() < point.getxDirection() + length) {
			if (point.getyDirection() < p.getyDirection()
					&& p.getyDirection() < point.getyDirection() + breadth) {
				return true;
			}
		}
		return false;
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
	 * calculate the area of the Rectangle
	 */
	public double getArea() {
		area = length * breadth;
		return area;
	}
	
	/* 
	 * return time stamp of the point
	 */
	public Date getTimeStamp() {
		return timeStamp;
	}

}
