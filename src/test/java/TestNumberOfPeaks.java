import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestNumberOfPeaks {

   @Test
   public void testNoArray() {
      int[] data = {};
      int expected = 0;
      int actual = MyIntArrayProject.getNumberOfValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatbanhagy volgy van");
   }

   @Test
   public void testNoValleys() {
      int[] data = {2,2,2,2,2,2};
      int expected = 0;
      int actual = MyIntArrayProject.getNumberOfValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatbanhagy volgy van");
   }

   @Test
   public void testOnValleys() {
      int[] data = {5,4,3,2,1,0,2,3,4};
      int expected = 1;
      int actual = MyIntArrayProject.getNumberOfValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatbanhagy volgy van");
   }


   @Test
   public void testTwoValleys() {
      int[] data = {5,4,3,2,1,0,2,3,4,3,2,1,0,1,2,3,4};
      int expected = 2;
      int actual = MyIntArrayProject.getNumberOfValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatbanhagy volgy van");
   }


   @Test
   public void testOnValleysEnd() {
      int[] data = {5,4,3,2,1,0};
      int expected = 1;
      int actual = MyIntArrayProject.getNumberOfValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatbanhagy volgy van");
   }

   @Test
   public void testOnValleysBegin() {
      int[] data = {0,1,2,3,4,5};
      int expected = 0;
      int actual = MyIntArrayProject.getNumberOfValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatbanhagy volgy van");
   }

   @Test
   public void testFiveValleys() {
      int[] data = {0,1,2,3,2,1,2,1,2,3,2,3,4,3,2,1,0,1,2,3};
      int expected = 5;
      int actual = MyIntArrayProject.getNumberOfValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatbanhagy volgy van");
   }

}
