import java.util.Random;
import java.lang.*;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Task5 {
 
   public static void main(String[] args) {
      int[] day = new int[15];
      Random random = new Random(); 
      int sum = 0;
      
      for (int i = 0; i < day.length; i++) {
        day[i] = random.nextInt(51); 
        System.out.printf(" %d ", day[i]);
        sum = sum + day[i];
      
        }
        int max = Arrays.stream(day).max().getAsInt();
        System.out.println("| Max: " + max);
        float avarage = sum / day.length;
        System.out.println("| Avarage: " + avarage);
        
   }
}