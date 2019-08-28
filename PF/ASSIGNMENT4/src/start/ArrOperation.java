/*
 * Design a class ArrOperation which should support following methods.
 *  Assume each method will receive an array of positive integers.
 *  
 *  
 *  1.   Return the size of the largest mirror section found in the input array.
Mirror section in an array is a group of contiguous elements such that somewhere in the array, the same group appears in reverse order. For example
maxMirror([1, 2, 3, 8, 9, 3, 2, 1]) → 3
maxMirror([7, 1, 4, 9, 7, 4, 1]) → 2
maxMirror([1, 2, 1, 4]) → 3
maxMirror*([1, 4, 5, 3, 5, 4, 1]) → 7
Throw assertion error in case array is empty.
2.   Return the number of clumps in the input array.
	Clump in an array is a series of 2 or more adjacent elements of the same value. For example
	
	countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
Throw assertion error in case array is empty.
3.  Solve fixXY problem
Return an array that contains exactly the same numbers as the input array, but rearranged so that every X is immediately followed by a Y. Do not move X within array, but every other number may move. For ex: 
Let’s say value of X is 4 and Y is 5. Then 
	
	fixXY([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fixXY([1, 4, 1, 5]) → [1, 4, 5, 1]
fixXY([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
Assume we are receiving an array of integers along with value of X and Y as a method parameter.
Throw assertion in following cases : 
If array is empty
If there are unequal numbers of X and Y in input array.
If two adjacents X values are there.
If X occurs at the last index of array.
4.   splitArray
Return the index if there is a place to split the input array so that the sum of the numbers on one side is equal to the sum of the numbers on the other side else return -1. For ex
splitArray([1, 1, 1, 2, 1]) → 3
splitArray([2, 1, 1, 2, 1]) → -1
splitArray([10, 10]) → 1
Throw assertion error in case array is empty.
*/
package start;

public class ArrOperation {

	/*
	 * @param a is an array of positive numbers in which mirror sub array has to be found out
	 * @return returns the maximum length of mirror found in the given array
	 */
	
	static int maxMirror(int a[]) throws Exception
	{
		if (a.length == 0) {
			throw(new Exception("Empty Array"));
			}

		int count,max_count=0,start_ptr,End_ptr,i,j;

		for(i=0;i<a.length;i++)
		{

			for(j=a.length-1;j>=0;j--)
			{	;
			    
				count=0;
				for(start_ptr=i,End_ptr=j;start_ptr<(a.length) && End_ptr>=0;start_ptr++,End_ptr--){
					if(a[start_ptr]== a[End_ptr]){
						count++;
					}
					else 
						break;
					
				}
				if(count>max_count)
					max_count=count;
			}
		}

		return max_count;
	}
	/*
	 * @param a is an array of positive integer in which no. of clumps are to be found
	 * @return returns total number of clumps
	 */
	public static int countClumps(int[] nums) {
	  boolean match = false;
	  int count = 0;
	  for (int i = 0; i < nums.length-1; i++) {
	    if (nums[i] == nums[i+1] && !match) {
	      match = true;
	      count++;
	    }
	    else if (nums[i] != nums[i+1]) {
	      match = false;
	    }
	  }
	  return count;
	}
	/*
	 * @param a is an array of positive integer whose split index has to be found out such that the splitted array have eqaul sum  
	 * @return returns split index and -1 in case array can't be splitted
	 */

	static int splitArray(int a[]) throws Exception
	{
		if (a.length == 0) {
			throw(new Exception("Empty Array"));
			}

		int split_index=-1;
		int start_ptr=-1,end_ptr=a.length,sum1=0,sum2=0;

		while(start_ptr!=(end_ptr-1))
		{
			if(sum1==sum2)
			{
				start_ptr++;
				end_ptr--;
				sum1+=a[start_ptr];
				sum2+=a[end_ptr];


			}
			else if(sum1<sum2)
			{
				start_ptr++;
				sum1+=a[start_ptr];

			}
			else
			{
				end_ptr--;
				sum2+=a[end_ptr];

			}
			if((start_ptr+1==end_ptr-1 && sum1==sum2))
				break;
		}
		if(sum1==sum2&& start_ptr==end_ptr-1)
			split_index=end_ptr;
		return split_index;
	}
	/*
	 * @param a is the array in which value of x and y are to be fixed
	 * @param x and @param y are two positive integers present in array
	 * @return returns an array by fixing position of x and y such that every x is followed by y
	 */

	static   int[] fixXY(int a[],int x,int y) throws Exception
	{
		if (a.length == 0) 
		{
			throw(new Exception("Empty Array"));
		}
		int t=0,i=0,j=0,count_x=0,count_y=0,adjacent_x=0;
		for(i=0;i<a.length;i++)
		{
			if(x==a[i])
				count_x++;
			else if(y==a[i])
				count_y++;
			if((i<a.length-1)&&(x==a[i]&&x==a[i+1]))
				adjacent_x++;
		}
		if(count_x!=count_y)
		{
			throw(new Exception("unequal numbers of X and Y in input array"));
		}
		if(0<adjacent_x)
		{
			throw(new Exception("two adjacents X values are there"));
		}
		if(x==a[a.length-1])
		{
			throw(new Exception("X occurs at the last index of array"));
		}

		for(i=0;i<a.length;i++)
		{
			if(a[i]==x && a[i+1]!=y)
				for(j=0;j<a.length;j++)
					if(a[j]==y&&( j==0||a[j-1]!=x ))
					{
						t=a[j];
						a[j]=a[i+1];
						a[i+1]=t;
					}
		}
		return a;
	}


public static void main(String args[]){
	int res;
	int[] res1 = new int[100];
	int a[]= new int[]{1,2,3,8,9,3,2,1};
	int b[]= new int[]{1,2,2,3,4,4};
	int c[]= new int[]{1,1,1,2,1};
	int d[]= new int[]{5,4,9,4,9,5};
	int x=4,y=5;
	try {
		res =  maxMirror(a);
		System.out.println(res);
		res = countClumps(b);
		System.out.println(res);
		res = splitArray(c);
		System.out.println(res);
		res1 = fixXY(d,x,y);
		for(int val:res1){
			System.out.println(val);
		}
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
}
