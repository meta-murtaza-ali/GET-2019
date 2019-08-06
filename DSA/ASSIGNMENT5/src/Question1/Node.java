package Question1;


/**
 * @author Murtaza ALi
 * Node class for node property 
 * String key, value 
 *
 */
public class Node {
	
	private String key;
	private String value;
	Node left,right,parent;
	 
	/**
	 * @param key
	 * @param value
	 * constructor
	 */
	public Node(String key, String value) {
		super();
		this.key = key;
		this.value = value;
		this.left = null;
		this.right = null;
		this.parent = null;
	}

	
	/**
	 * @return
	 * getter method for key
	 */
	public String getKey() {
		return key;
	}

	
	/**
	 * @param key
	 * setter method for key
	 */
	public void setKey(String key) {
		this.key = key;
	}

	
	/**
	 * @return
	 * getter method for value
	 */
	public String getValue() {
		return value;
	}

	
	/**
	 * @param value
	 * setter method for value
	 */
	public void setValue(String value) {
		this.value = value;
	}

	
	/**
	 * @return
	 * getter method for left child
	 */
	public Node getLeft() {
		return left;
	}

	
	/**
	 * @param left
	 * setter method for left child
	 */
	public void setLeft(Node left) {
		this.left = left;
	}

	
	/**
	 * @return
	 * getter method right child
	 */
	public Node getRight() {
		return right;
	}

	
	/**
	 * @param right
	 * setter method for right
	 */
	public void setRight(Node right) {
		this.right = right;
	}

	
	/**
	 * @return
	 * getter method for parent
	 */
	public Node getParent() {
		return parent;
	}

	
	/**
	 * @param parent
	 * setter method for parent
	 */
	public void setParent(Node parent) {
		this.parent = parent;
	}
	
	
	
}
