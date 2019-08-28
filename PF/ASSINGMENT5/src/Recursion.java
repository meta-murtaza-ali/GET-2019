/*
 * Design a class to implement following mathematical problems.
 * L.C.M. of two numbers x and y. Receive x and y as method parameters and
 * return computed value.
 * H.C.F of two numbers x and y using Euclid’s algorithm. Receive x and y as
 * method parameters and return computed value.
 * Assume x and y as positive integers.
 * @author Murtaza
 */
public class Recursion {
	/*
	 * @param num1 and @param num2 are two positive integers whose hcf is to be calculated
	 * @return returns hcf of num1 and num2
	 */
	static int HCf(int num1,int num2)throws Exception{
		int large = 0,small = 0;
		if(num1==0){
			return num2;
		}
		else if (num2==0){
			return num1;
		}
		else if(num1==0 && num2==0){
			throw (new Exception ("Divide by zero"));
		}
		if(num1>num2){
			 large = num1;
			 small = num2;
		}
		else {
			large = num2;
			small = num1;
		}
		return HCf(large % small , small);
	}

	/*
	 * @param num1 and @param num2 are two positive integers whose lcm is to be calculated
	 * @return returns lcm of num1 and num2
	 */
	static int LCM(int num1, int num2)throws Exception{
		int hcf = HCf(num1,num2);
		int LCM=0;
		if(hcf==0){
			throw(new Exception("Divide By Zero"));
		}
		LCM = num1*num2/hcf;
		return LCM;
	}
	static int Linear(int []arr, int element )throws Exception
	{
		int str=0;
		return LinearSearch(arr,str,element);
		
	}
	static int LinearSearch(int []array, int index,int ele)throws Exception{
		if(index==array.length)
		{
			return -1;
		}
		if(array.length==0){
			throw(new Exception("Empty Array"));
		}
		if(array[index] == ele){
			return index+1;
		}
		
		return LinearSearch(array,++index,ele);
	}
	

	static int BinearySearch()throws Exception{
		return 0;
		
	}
	public static void main(String[] args){
		int []a = new int[]{12, 34, 54, 2, 3};
		try {
			System.out.println(Linear(a,2));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
