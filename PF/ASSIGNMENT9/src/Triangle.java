import java.util.Date;

/**
 * This Triangle class implements Shape interface
 * @author Murtaza Ali
 */
public class Triangle implements Shape {
	private double height;
	private double base;
	private double area;
	private Point point;
	private Date timeStamp;
	private double hypotenuse;

	public Triangle(double Height, double Base, Point origin, Date timeStamp) {
		this.height = Height;
		this.base = Base;
		this.point = origin;
		this.timeStamp = new Date();
		hypotenuse = Math.sqrt((base * base) + (height * height));
	}

	/*
	 * calculate the area of the triangle
	 */
	public double getArea() {
		area = (height * base) / 2;
		return area;
	}

	/*
	 * return Shapetype
	 */
	public Shapetype getType() {
		return Shapetype.TRIANGLE;
	}

	/*
	 * return parameter of the triangle
	 */
	public double getPerimeter() {
		return base + height + hypotenuse;
	}

	/*
	 * return origin point
	 */
	public Point getOrigin() {
		return point;
	}

	/**
	 * @param x1 coordinate of point 1
	 * @param y1 coordinate of point 1
	 * @param x2 coordinate of point 2
	 * @param y2 coordinate of point 2
	 * @param x3 coordinate of point 3
	 * @param y3 coordinate of point 3
	 * @return
	 */
	public double calculateSubArea(double x1, double y1, double x2, double y2,
			double x3, double y3) {
		return Math
				.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2)) / 2.0);
	}

	/**
	 * to check for a point is enclosed in shape
	 * @param, point to check
	 * @return true if enclosed, false otherwise
	 */
	@Override
	public boolean isPointEnclosed(Point p) {
		boolean flg = false;
		Point p2 = new Point(p.getxDirection() + base, p.getyDirection());
		Point p3 = new Point(p.getxDirection(), p.getyDirection() + height);
		Point p1 = p;

		double x1 = p1.getxDirection();
		double x2 = p2.getxDirection();
		double x3 = p3.getxDirection();
		double y1 = p1.getyDirection();
		double y2 = p2.getyDirection();
		double y3 = p3.getyDirection();

		double subArea1 = calculateSubArea(point.getxDirection(),
				point.getyDirection(), x2, y2, x3, y3);
		double subArea2 = calculateSubArea(x1, y1, point.getxDirection(),
				point.getyDirection(), x3, y3);
		double subArea3 = calculateSubArea(x1, y1, x2, y2,
				point.getxDirection(), point.getyDirection());

		if (getArea() == subArea1 + subArea2 + subArea3) {
			flg = true;
		}

		return flg;
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
