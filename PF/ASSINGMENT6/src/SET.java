/**
 * Implement the immutable class intSet using an array to represent a set of
 * integers in the range 1-1000. It should support public methods like -
 * 
 * isMember(int x) - check whether x is a member of the set and return a boolean
 * value
 * 
 * size() - return the size of the set
 * 
 * isSubSet(intSet s) - check whether s is a subset of the set
 * 
 * getComplement() - return the complement set, you can assume that 1..1000 is
 * the universal set
 * 
 * union(intSet s1, intSet s2) - return the union of s1 and s2
 * 
 * You may use private helper methods.
 * 
 * 
 * @author Murtaza
 *
 */
public final class SET {
	private final int set[];

	public SET(int[] array) throws Exception {
		if (array.length == 0) {
			throw (new Exception("Empty set"));
		}
		this.set = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			set[i] = array[i];
		}
	}
	

	/**
	 * @param x element to be checked in set
	 * @return true if element is present on set else return false
	 */
	public boolean isMember(int x)throws Exception {
		for (int i = 0; i < set.length; i++) {
			if (set[i] == x) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return size of the set
	 */
	public int Size() {
		return set.length;
	}

	
	/**
	 * @param SET s is the object to check the subset 
	 * @return true if it is a subset else false
	 */
	public boolean isSubSet(SET s)throws Exception {
		int j;
		for (int i = 0; i < s.set.length; i++) {
			for ( j = 0; j < set.length; j++) {
				if (s.set[i] == set[j]) {
					break;
				}
				
			}
			if (j == set.length) {
				return false;
			}

		}
		return true;
	}
	

	/**
	 * @return Complement of a set
	 */
	public int[] getComplement()throws Exception {
		int comp[] = new int[1000 - set.length];
		int flag = 0, index = 0;
		for (int i = 0; i < 1000; i++) {
			flag = 0;
			for (int j = 0; j < set.length; j++) {
				if (set[j] == i) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				comp[index] = i;
				index++;
			}
		}
		return comp;
	}
	

	/**
	 * @param set1 is a set of some number 
	 * @param set2 is a set of ome number
	 * @return return union of set1 and set2
	 */
	public int[] Union(int[] set1, int[] set2)throws Exception {
		int count = 0, flag = 0, index = 0;
		for (int i = 0; i < set2.length; i++) {
			flag=0;
			for (int j = 0; j < set1.length; j++) {
				if (set2[i] == set1[j]) {
					flag=1;
					break;
				}
			}
			if (flag == 0) {
				count++;
			}
		}
		
		int k;
		int carry[] = new int[set1.length + count];
		for (k = 0; k < set1.length; k++) {
			carry[k] = set1[k];
		}
		int j;
		for (int i = 0; i < set2.length; i++) {
			flag=0;
			for ( j = 0; j < set1.length; j++) {
				if (set2[i] == set1[j]) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				carry[k] = set2[i];
				k++;
			}
		}
		return carry;
	}

	public static void main(String[] args) {
		int a[] = new int[] { 1, 2, 3, 4, 5, 6 };
		int d[] = new int[]{7,8};
		int b[][] = new int[][] { { 1, 2, 3 }, { 2, 1 }, { 3, 1 } };
		 try {
			 SET set = new SET(a);
			SET setarray= new SET( new int[]{7,8});
			System.out.println(set.isSubSet(setarray));
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			SET set = new SET(a);
			System.out.println(set.isMember(5));
			System.out.println(set.Size());
			//System.out.println(set.isSubSet(a));
			System.out.println(set.getComplement());
			int c[]=set.Union(a, d);
			for(int ele:c){
				System.out.print(ele);
			}
			System.out.println();
			System.out.print(b[0].length);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
