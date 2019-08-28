package QUESTION1;

/**
 * This class represents Top category details with their child count.
 * 
 * @author Murtaza Ali
 *
 */
public class TopCategoryDetail {
	private String name;
	private int numberOfChildren;

	/**
	 * @return name of order
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name set of a order
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return number of children of category
	 */
	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	/**
	 * @param numberOfChildren set number of children
	 */
	public void setNumberOfChildren(int numberOfChildren) {
		this.numberOfChildren = numberOfChildren;
	}

}
