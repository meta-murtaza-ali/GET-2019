import java.util.Date;

/**
 * Square class implements Shape interface
 * @author Murtaza Ali
 *
 */
public class Square implements Shape {
	private double area;
	private double perimeter;
	private Point point;
	private double side;
	private Date timeStamp;

	public Square(double Side, Point origin, Date timeStamp) {
		this.side = Side;
		this.point = origin;
		this.timeStamp = new Date();
	}

	/* 
	 * calculate the area of the square
	 */
	public double getArea() {
		area = Math.pow(side, 2);
		return area;
	}

	/*
	 * return Shapetype
	 */
	public Shapetype getType() {
		return Shapetype.SQUARE;
	}

	/*
	 * return parameter of the square
	 */
	public double getPerimeter() {
		perimeter = 4 * side;
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
	@Override
	public boolean isPointEnclosed(Point p) {
		if (point.getxDirection() < p.getxDirection()
				&& p.getxDirection() < point.getxDirection() + side) {
			if (point.getyDirection() < p.getyDirection()
					&& p.getyDirection() < point.getyDirection() + side) {
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
	 * return time stamp of the point
	 */
	public Date getTimeStamp() {

		return timeStamp;
	}

}
