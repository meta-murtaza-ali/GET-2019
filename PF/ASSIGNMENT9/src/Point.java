/**
 * This class represent the location of PointX and PointY on a screen size of
 * 1080*720
 * 
 * @author Murtaza Ali
 *
 */
public class Point {
	public double xdirection;
	public double ydirection;

	/**
	 * It will check whether point lies on screen or not and then initialize the
	 * point
	 * 
	 * @param xCoordinate
	 * @param yCoordinate
	 */
	public Point(double x, double y) {
		xdirection = x;
		ydirection = y;
	}

	/**
	 * It will return X-Coordinate of point
	 * 
	 * @return
	 */
	public double getxDirection() {
		return xdirection;
	}

	/**
	 * It will return Y-Coordinate of point
	 * 
	 * @return
	 */
	public double getyDirection() {
		return ydirection;
	}

	/**
	 * It will return origin point
	 * 
	 * @return
	 */
	public double[] getOrigin() {
		double[] point = new double[2];
		point[0] = xdirection;
		point[1] = ydirection;
		return point;
	}

}
