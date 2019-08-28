import java.util.Date;
import java.util.List;

/**
 * This class is Factory class for creating Shape Object
 * 
 * @author Murtaza Ali
 *
 */
public class FactoryShape {

	public static Shape CreateShape(Shape.Shapetype shapetype,
			List<Double> parameters, Point origin) throws Exception {
		Shape shape = null;
		switch (shapetype) {
		case CIRCLE:
			double radius = parameters.get(0);
			shape = new Circle(radius, origin, new Date());
			return shape;

		case RECTANGLE:
			double length = parameters.get(0);
			double breadth = parameters.get(1);
			shape = new Rectangle(length, breadth, origin, new Date());
			return shape;

		case TRIANGLE:
			shape = new Triangle(parameters.get(0), parameters.get(1), origin,
					new Date());
			return shape;

		case SQUARE:
			shape = new Square(parameters.get(0), origin, new Date());
			return shape;

		default:
			throw (new Exception("Invalid Input"));

		}
	}

}
