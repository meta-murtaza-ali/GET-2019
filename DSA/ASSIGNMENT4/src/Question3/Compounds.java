package Question3;

/**
 * This class define compound class
 * 
 * @author Murtaza Ali
 *
 */
public class Compounds {
	private char element;
	private int base;

	/**
	 * This method takes element name and their base
	 * 
	 * @param element
	 *            is element name
	 * @param base
	 *            is the occurrence of that element in the compound
	 */
	public Compounds(char element, int base) {
		this.element = element;
		this.base = base;
	}

	/**
	 * Return element name
	 * 
	 * @return
	 */
	public char getElement() {
		return element;
	}

	/**
	 * Set element
	 * 
	 * @param element
	 */
	public void setElement(char element) {
		this.element = element;
	}

	/**
	 * Return element base
	 * 
	 * @return
	 */
	public int getBase() {
		return base;
	}

	/**
	 * Set element Base
	 * 
	 * @param base
	 */
	public void setBase(int base) {
		this.base = base;
	}
}
