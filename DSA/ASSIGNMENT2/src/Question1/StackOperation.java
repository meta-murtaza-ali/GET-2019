package Question1;


/**
 * @author Murtaza Ali
 * StackOperation class implements the Stack interface and give definition to its operational functions
 *
 */
public class StackOperation implements Stack {

	static final int MAX = 1000;
	int top;
	String a[] = new String[MAX];

	public boolean isEmpty() {
		if (top < 0)
			return true;
		return false;
	}

	StackOperation() {
		top = -1;
	}
	
	/**
	 * @param string
	 * @return true if successfully pushed to the stack
	 * method will push the @param string to the stack
	
	 */
	public boolean push(String string) {
		if (top >= (MAX - 1)) {
			System.out.println("Stack Overflow");
			return false;
		} else {
			a[++top] = string;
			System.out.println(string + " pushed into stack");
			return true;
		}
	}
	
	/**
	 * @return the popped element from the stack
	 * method will pop the element from the stack 
	 */
	public String pop() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return "";
		} else {
			String x = a[top--];
			System.out.println(x + "poped from stack");
			return x;
		}
	}

	/**
	 * @return the top most element from the stack
	 */
	public String peek() {
		if (top < 0) {
			System.out.println("Stack Underflow");
			return "";
		} else {
			String x = (a[top]);
			return x;
		}
	}

	/**
	 * @param ch is the operator
	 * @return the precedence of the character
	 * method will return the precedence of the @param ch
	 */
	public int Prec(String ch) 
    { 
        switch (ch) 
        { 
        case "+": 
        case " - ": 
            return 6; 
       
        case "*": 
        case "/": 
            return 7; 
       
        case "^": 
            return 3;
        case "&&":
        	return 2;
        case "==":
        case "!=":
        	return 4;
        case "<":
        case ">":
        case "<=":
        case ">=":
        	return 5;
        case "||":
        	return 1;
        } 
        return -1; 
    } 
}
