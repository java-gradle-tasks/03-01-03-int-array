import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

   public class TestMonotonDecreasing {

      @Test
      public void testNoArray() {
         int[] data={};
         boolean expected=false;
         boolean actual=MyIntArrayProject.isTheSeriesMonotonDecreasing(data);
         Assertions.assertEquals(expected,actual,"Rosszult hatarozta meg, hogy a sorozatban van-e monoton csokkeno sorozat!");
      }

      @Test
      public void testDecreasingArray() {
         int[] data={5,4,3,2,1,0};
         boolean expected=true;
         boolean actual=MyIntArrayProject.isTheSeriesMonotonDecreasing(data);
         Assertions.assertEquals(expected,actual,"Rosszult hatarozta meg, hogy a sorozatban van-e monoton csokkeno sorozat!");
      }

      @Test
      public void testNoDecreasingArrayBeginning() {
         int[] data={1,5,4,3,2,1,0};
         boolean expected=false;
         boolean actual=MyIntArrayProject.isTheSeriesMonotonDecreasing(data);
         Assertions.assertEquals(expected,actual,"Rosszult hatarozta meg, hogy a sorozatban van-e monoton csokkeno sorozat!");
      }

      @Test
      public void testNoDecreasingArrayEnd() {
         int[] data={5,4,3,2,1,0,1};
         boolean expected=false;
         boolean actual=MyIntArrayProject.isTheSeriesMonotonDecreasing(data);
         Assertions.assertEquals(expected,actual,"Rosszult hatarozta meg, hogy a sorozatban van-e monoton csokkeno sorozat!");
      }
   }
