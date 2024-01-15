import java.util.Random;
import java.util.Arrays;

public class Task3 {
 
   public static void main(String[] args) {
      Random random = new Random();      
      int[] height = new int[12];
      for(int i = 0; i < height.length; i++){
        height[i] = random.nextInt(28) + 163;
        System.out.printf("%d ", height[i]);     
      }
      String fmt = "%d ";
      Arrays.sort(height);
      for(int i = 0; i < height.length; i++){
        System.out.printf("Sorting:" + fmt, height[i]);
      }
      
   }
}