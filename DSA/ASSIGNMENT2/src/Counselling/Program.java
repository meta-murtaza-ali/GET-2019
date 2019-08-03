package Counselling;

/**
 * @author Murtaza Ali
 * Program class take program name and its capacity
 */
public class Program {
	public String ProgramName;
	public int Capacity;
	public Program(String name,int capacity){
		this.ProgramName = name;
		this.Capacity = capacity;
		
	}
	
	/**
	 * set the capacity of the program
	 * @param capacity
	 */
	public void setCapacity(int capacity){
		this.Capacity = capacity;
	}
	
	/**
	 * @return capacity of the program
	 */
	public int getCapacity(){
		return Capacity;
	}
	
	/**
	 * @return name of the program
	 */
	public String getName(){
		return ProgramName;
	}

}
