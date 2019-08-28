package Counselling;

/**
 * @author Murtaza Ali
 * Student class add student name and their prefrence
 *
 */
public class Student {
	public String StudentName;
	public  String[] Prefrence = new String[100];
	
	public Student(String name, String[] pref){
		this.Prefrence = pref;
		for(String ele : Prefrence)
			System.out.println(ele);
		this.StudentName = name;
		
	}
	
	/**
	 * @return Student Name
	 */
	public String getName(){
		return StudentName;
	}
	
	/**
	 * @return preference of the Student
	 */
	public String[] getPrefrence(){
		return Prefrence;
	}
} 
