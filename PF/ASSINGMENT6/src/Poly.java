/**
 * Implement the immutable class Poly using an array to represent single
 * variable polynomial. Note that you should be storing only those terms of
 * polynomial that have non zero coefficient. You can assume that the
 * coefficients are integers
 * 
 * @author Murtaza
 *
 */
public class Poly {
	public final int Polynomial[][];

	/**
	 * @param poly 
	 * @throws Exception
	 */
	public Poly(int[] poly) throws Exception {
		if (poly.length == 0) {
			throw (new Exception("Empty Polynomial Array"));
		}
		int count = 0;
		for (int i = 0; i < poly.length; i++) {
			if (poly[i] != 0) {
				count++;
			}
		}
		Polynomial = new int[count][2];
		count = 0;
		for (int i = 0; i < poly.length; i++) {
			if (poly[i] != 0) {
				Polynomial[count][0] = i;
				Polynomial[count][1] = poly[i];
				count++;
			}
		}
	}

	public float evaluate(float x) {
		if (x == 0.0) {
			return x;
		}
		int value = 0;
		for (int i = 0; i < Polynomial.length; i++) {
			value += Math.pow(x, Polynomial[i][0]) * Polynomial[i][1];
		}
		return value;
	}

	public int degree() {
		int degreeOfPolynomial = Polynomial[Polynomial.length - 1][0];
		return degreeOfPolynomial;
	}

	private int getIndexof(int index) {
		int x = -1;
		for (int i = 0; i < Polynomial.length; i++) {
			if (Polynomial[i][0] == index) {
				x = Polynomial[i][0];
			}
		}
		return x;
	}

	private int getValueof(int index) {
		int x = -1;
		for (int i = 0; i < Polynomial.length; i++) {
			if (Polynomial[i][0] == index) {
				x = Polynomial[i][1];
			}
		}
		return x;
	}

	public int[] addPoly(Poly p1, Poly p2) {
		int max_degree = p1.degree() > p2.degree() ? p1.degree() : p2.degree();
		int sum[] = new int[max_degree + 1];
		for (int i = 0; i < max_degree + 1; i++) {
			if (p1.getIndexof(i) == p2.getIndexof(i)) {
				sum[i] = p1.getValueof(i) + p2.getValueof(i);
			}else if (p1.getIndexof(i) == -1 && p2.getIndexof(i) != -1 ) {
				sum[i] = p2.getValueof(i);
			} else if (p2.getIndexof(i) == -1&&p1.getIndexof(i) != -1) {
				sum[i] = p1.getValueof(i);
			}
			else
				sum[i]=0;
		}
		return sum;
	}

	public int[] mulPoly(Poly p1, Poly p2) {
		int max_degree = p1.degree()*p2.degree();
		int mul[] = new int[max_degree +1];
	
		for (int i = 0; i <= p1.degree() ; i++) {
			for (int j = 0; j <=p2.degree() ; j++) {
				if(p1.getIndexof(i) > -1 && p2.getIndexof(j) > -1)
				mul[p1.getIndexof(i) + p2.getIndexof(j)]+= p1.getValueof(i) * p2.getValueof(j);
				
			}
		}
		for(int ele:mul){
			System.out.print(ele);
		}
		return mul;
	}
}
