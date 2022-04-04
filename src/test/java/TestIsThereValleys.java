import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestIsThereValleys {

   @Test
   public void testNoArray() {
      int[] data = {};
      boolean expected = false;
      boolean actual = MyIntArrayProject.isThereValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatban van-e volgy");
   }

   @Test
   public void testNoValleys() {
      int[] data = {2,2,2,2,2,2};
      boolean expected = false;
      boolean actual = MyIntArrayProject.isThereValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatban van-e volgy");
   }

   @Test
   public void testOnValleys() {
      int[] data = {5,4,3,2,1,0,2,3,4};
      boolean expected = true;
      boolean actual = MyIntArrayProject.isThereValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatban van-e volgy");
   }


   @Test
   public void testTwoValleys() {
      int[] data = {5,4,3,2,1,0,2,3,4,3,2,1,0,1,2,3,4};
      boolean expected = true;
      boolean actual = MyIntArrayProject.isThereValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatban van-e volgy");
   }


   @Test
   public void testOnValleysEnd() {
      int[] data = {5,4,3,2,1,0};
      boolean expected = true;
      boolean actual = MyIntArrayProject.isThereValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatban van-e volgy");
   }

   @Test
   public void testOnValleysBegin() {
      int[] data = {0,1,2,3,4,5};
      boolean expected = true;
      boolean actual = MyIntArrayProject.isThereValleys(data);
      Assertions.assertEquals(expected, actual, "Rosszult hatarozta meg, hogy a sorozatban van-e volgy");
   }
}
