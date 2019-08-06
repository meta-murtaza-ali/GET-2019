package Question1;

/**
 * @author Murtaza Ali
 * value class for containing key and value in pair
 * String key,value
 */
public class Value {
	
	private String key;
	private String value;
	
	
	/**
	 * @param key
	 * @param value
	 * constructor
	 */
	public Value(String key, String value) {
		super();
		this.key = key;
		this.value = value;
	}
	
	/**
	 * @return
	 * getKey
	 */
	public String getKey() {
		return key;
	}
	
	/**
	 * @param key
	 * setKey
	 */
	public void setKey(String key) {
		this.key = key;
	}
	
	/**
	 * @return
	 * getValue
	 */
	public String getValue() {
		return value;
	}
	
	/**
	 * @param value
	 * setValue
	 */
	public void setValue(String value) {
		this.value = value;
	}
	
	

}