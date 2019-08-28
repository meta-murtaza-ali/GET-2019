
/**
 * Design a class Area to calculate areas for different shapes
 * @author Murtaza
 *
 */
public class Shapes {

	/**
	 * @param width
	 * @param height
	 * @return area of triangle
	 * @throws Exception
	 */
	public double triangle_area(double width,double height)throws Exception{
		if(width<0||height<0){
			throw (new Exception("negative dimension not allowed"));
		}
		double area=(width*height)/2;
		return area;
	}
	/**
	 * @param width
	 * @param height
	 * @return area of rectangular
	 * @throws Exception
	 */
	public double rectangle_area(double width,double height) throws Exception{
		if(width<0||height<0){
			throw (new Exception("negative dimension not allowed"));
		}
		double area=width*height;
		return area;		
	}
	
	/**
	 * @param radius
	 * @return area of circle
	 * @throws Exception
	 */
	public double circle_area(double radius) throws Exception{
		if(radius<0){
			throw (new Exception("negative dimension not allowed"));
		}
		double area=(3.14)*radius*radius;
		return area;
	}
	
	/**
	 * @param width
	 * @return area of square
	 * @throws Exception
	 */
	public double square_area(double width) throws Exception{
		if(width<0){
			throw (new Exception("negative dimension not allowed"));
		}
		double area=width*width;
		return area;
	}
	
	public static void main(String args[])throws ArithmeticException{
		Shapes s=new Shapes();
		try{
		System.out.println(s.triangle_area(0, -1));
		System.out.println(s.rectangle_area(2, 4));
		System.out.println(s.circle_area(1));
		System.out.println(s.square_area(6));
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}
