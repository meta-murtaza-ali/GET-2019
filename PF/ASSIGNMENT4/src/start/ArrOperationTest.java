package start;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;

public class ArrOperationTest {


   ArrOperation arr_operation = new ArrOperation();

   @Test
   public void testMaxMirrorArray1() {
	   try { ArrOperation.maxMirror(new int[]{ }); }
	   catch (Exception e) { assertEquals("Empty Array", e.getMessage());}
   }
   @Test
   public void testSplitArray() {
	   try { ArrOperation.splitArray(new int[]{ }); }
	   catch (Exception e) { assertEquals("Empty Array", e.getMessage());}
   }
   @Test
   public void testcountClumpsArray() {
	   try { ArrOperation.countClumps(new int[]{ }); }
	   catch (Exception e) { assertEquals("Empty Array", e.getMessage());}
   }
   @Test
   public void testfixXYArray() {
	   try { ArrOperation.fixXY(new int[]{ },4,5); }
	   catch (Exception e) { assertEquals("Empty Array", e.getMessage());}
   }


   @Test
   public void testfixXYUnequal() {
	   try { ArrOperation.fixXY(new int[]{4,5,2,4,2},4,5); }
	   catch (Exception e) { assertEquals("unequal numbers of X and Y in input array", e.getMessage());}
   }
   @Test
   public void testfixXYAdjacent() {
	   try { ArrOperation.fixXY(new int[]{4,4,5,5,3,1 },4,5); }
	   catch (Exception e) { assertEquals("two adjacents X values are there", e.getMessage());}
   }
   @Test
   public void testfixXYLastX() {
	   try { ArrOperation.fixXY(new int[]{4,3,5,4,3,2,5,5,4},4,5); }
	   catch (Exception e) { assertEquals("X occurs at the last index of array", e.getMessage());}
   }


   @Test
   public void testMaxMirror1() throws Exception {	  
      assertEquals(3,ArrOperation.maxMirror(new int[]{1, 2, 3, 8, 9, 3, 2, 1}));
   }
   @Test
   public void testMaxMirror2() throws Exception{	  
      assertEquals(2,ArrOperation.maxMirror(new int[]{7,1,4,9,7,4,1}));
   }
   @Test
   public void testMaxMirror3() throws Exception{	  
      assertEquals(3,ArrOperation.maxMirror(new int[]{1, 2, 1,4}));
   }
   @Test
   public void testMaxMirror4() throws Exception{	  
      assertEquals(7,ArrOperation.maxMirror(new int[]{1, 4, 5, 3, 5, 4, 1}));
   }




   @Test
   public void testCountClumps1() throws Exception{	  
      assertEquals(2,ArrOperation.countClumps(new int[]{1, 2, 2, 3, 4, 4}));
   }
   @Test
   public void testCountClumps2() throws Exception{	  
      assertEquals(2,ArrOperation.countClumps(new int[]{1, 1, 2, 1, 1}));
   }
   @Test
   public void testCountClumps3() throws Exception{	  
      assertEquals(1,ArrOperation.countClumps(new int[]{1,1,1,1,1}));
   }





   @Test
   public void testSplitArrOperation1() throws Exception{	  
      assertEquals(3,ArrOperation.splitArray(new int[]{ 1, 1, 1, 2, 1}));
   }

   @Test
   public void testSplitArrOperation2() throws Exception{	  
      assertEquals(-1,ArrOperation.splitArray(new int[]{2, 1, 1, 2, 1}));
   }

   @Test
   public void testSplitArrOperation3() throws Exception{	  
      assertEquals(1,ArrOperation.splitArray(new int[]{10,10}));
   }




   @Test
   public void testFixXY1() throws Exception{	
	   int returnedArrOperation[] = ArrOperation.fixXY(new int[]{5, 4, 9, 4, 9, 5},4,5);
	   int []expectedArr = new int[]{9, 4, 5, 4, 5, 9};
	   Assert.assertArrayEquals( expectedArr, returnedArrOperation );
   }
   @Test
   public void testFixXY2() throws Exception{	
	   int returnedArrOperation[] = ArrOperation.fixXY(new int[]{1,4,1,5},4,5);
	   int []expectedArr = new int[]{1,4,5,1};
	   Assert.assertArrayEquals( expectedArr, returnedArrOperation );
   }
   @Test
   public void testFixXY3() throws Exception{	
	   int returnedArrOperation[] = ArrOperation.fixXY(new int[]{1,4,1,5,5,4,1},4,5);
	   int []expectedArr = new int[]{1,4,5,1,1,4,5};
	   Assert.assertArrayEquals( expectedArr, returnedArrOperation );
   }


} 
