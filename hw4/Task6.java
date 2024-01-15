import java.util.*;
import java.util.Random;

public class Task6 {
 
   public static void main(String[] args) {
       int[] m = new int[10];
       Random random = new Random(); 
      
      for (int i = 0; i < m.length; i++) {
        m[i] = random.nextInt(21)-10; 
        
        System.out.print("  " + m[i]);
        
   }
        System.out.println();
        System.out.println("Negative numbers: ");
        for (int value : m) {
            if (value < 0) {
                System.out.print(" "+ value); 
              
            }
            
           
        }
        System.out.println();
        System.out.println("Non-negative numbers: ");
         for (int value : m) {
            if (value > 0) {
                System.out.print(" "+ value);
            }
         }
        System.out.println();
        System.out.println("Non-even indices: ");
        int even = 1;
        while (even < m.length) {
            System.out.print(m[even] + " ");
            even = even + 2;
        }
        System.out.println();
        System.out.println("even indices: ");
        int nonEven = 2;
        while (nonEven < m.length) {
            System.out.print(m[nonEven] + " ");
            nonEven = nonEven + 2;
        }
}
}