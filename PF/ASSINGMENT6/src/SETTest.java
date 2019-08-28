import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SETTest {

	// test of set values out of range
	@Test
	public void testSet_Out_Range() {
		 try {
			 SET setarray= new SET( new int[]{-1,1002});
		 }
		 catch (Exception e) {
			 assertEquals("Value out of range", e.getMessage());
		 }
	}

	// positive test case for determining size of set 
	@Test
	public void testLength()throws Exception  {

			 SET setarray= new SET( new int[]{6,7,8,10});
			 int returnedValue =setarray.Size(); 
			 int expectedValue = 4;
			 Assert.assertEquals( expectedValue, returnedValue );
	}

	// positive test case to check if the number is member of set 
	@Test
	public void testFind_Value_Positive() throws Exception {
			 SET setarray= new SET( new int[]{1,2,3,4,5});
			 assertTrue(setarray.isMember(4) );	 
	}

	// negative test case to check if the number is member of set
	@Test
	public void testFind_Value_Negative() throws Exception {
			 SET setarray= new SET( new int[]{1,2,3,4,5});
			 assertFalse(setarray.isMember(8) );	 
	}

	//positive test to check if given array is a subset 
	 @Test
	   public void test_Is_Subset_Positive() throws Exception{	
		 SET setarray= new SET( new int[]{1,2,3,4,5});
		 SET subsetarray= new SET( new int[]{1,2,3});
		 assertTrue(setarray.isSubSet(subsetarray));	   
	   }

	//negative test to check if given array is a subset 	 
	 @Test
	   public void test_Is_Subset_Negative() throws Exception{	
		 SET setarray= new SET( new int[]{1,2,3,4,5});
		 SET subsetarray= new SET( new int[]{7,8});
		 assertFalse(setarray.isSubSet(subsetarray));	   
	   }

	

	//positive test for union operation of sets
	 @Test
	   public void test_Union_Set_Same() throws Exception{
		 int[] setarray1=  new int[]{1,2,3};
		 int[] setarray2=  new int[]{1,2,3};
		 SET set = new SET(setarray1);
		 int returnedArrOperation[] =set.Union(setarray1,setarray2); 
		 int []expectedArr = new int[] {1,2,3};
		 Assert.assertArrayEquals( expectedArr, returnedArrOperation );
	   }

	 @Test
	   public void test_Union_Set_Diff() throws Exception{
		 int[] setarray1=  new int[]{1,2,3};
		 int[] setarray2= new int[]{4,5,6};
		 SET set = new SET(setarray1);
		 int returnedArrOperation[] =set.Union(setarray1,setarray2); 
		 int []expectedArr = new int[] {1,2,3,4,5,6};
		 Assert.assertArrayEquals( expectedArr, returnedArrOperation );
	   }

	 @Test
	   public void test_Union_Set_Mix() throws Exception{
		 int[] setarray1=  new int[]{1,2,3};
		 int[] setarray2=  new int[]{2,3,5,6};
		 SET set = new SET(setarray1);
		 int returnedArrOperation[] =set.Union(setarray1,setarray2); 
		 int []expectedArr = new int[] {1,2,3,5,6};
		 Assert.assertArrayEquals( expectedArr, returnedArrOperation );
	   }

	 @Test
	   public void test_Union_Set_Null() throws Exception{
		
		 int[] setarray1=  new int[]{1,2,3};
		 int[] setarray2=  new int[]{};
		 SET set = new SET(setarray1);
		 int returnedArrOperation[] =set.Union(setarray1,setarray2); 
		 int []expectedArr = new int[] {1,2,3};
		 Assert.assertArrayEquals( expectedArr, returnedArrOperation );
	   }
}