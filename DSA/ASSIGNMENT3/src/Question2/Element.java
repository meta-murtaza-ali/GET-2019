package Question2;

/**
 * @author Murtaza Ali
 *
 */
public class Element {
	Object element;
	int priority;
	
	/**
	 * @param ele
	 * @param prior
	 * Store the Elements detail
	 */
	public Element(Object ele,int prior){
		this.element=ele;
		this.priority=prior;
	}
	
	/**
	 * @return element
	 */
	public Object getElement(){
		return element;
	}
	
	/**
	 * @return priority
	 */
	public int getPriority(){
		return priority;
	}

}
