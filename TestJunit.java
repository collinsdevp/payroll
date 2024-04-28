import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestJunit {
	
  

   @Test
   public void fulltime() {
      assertEquals(String.valueOf(100*260), "26000");
   }
      @Test
   public void parttime1() {
      assertEquals(String.valueOf(16*11.40), "182.4");
   }
        @Test
   public void partime2() {
      assertEquals(String.valueOf(17*11.40), "193.8");
   }
   
}