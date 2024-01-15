import java.util.Arrays;

public class Task4 {
 
   public static void main(String[] args) {
       int[] a = new int[16];
       a[0] = 1;
       a[1] = 1;
       a[2] = a[0]+a[1];
       a[3] = a[1]+a[2];
       a[4] = a[2]+a[3];
       a[5] = a[3]+a[4];
       a[6] = a[4]+a[5];
       a[7] = a[5]+a[6];
       a[8] = a[6]+a[7];
       a[9] = a[7]+a[8];
       a[10] = a[8]+a[9];
       a[11] = a[9]+a[10];
       a[12] = a[10]+a[11];;
       a[13] = a[11]+a[12];;
       a[14] = a[12]+a[13];;
       a[15] = a[13]+a[14];;

      System.out.println(Arrays.toString(a));
      
      // for(int i = 0; i < a.length; i++){
      //      System.out.print(a[i] + " ");
      // }

       for (int i = a.length-1; i > 0; i--) {
         System.out.print(a[i] + " |");
      }
   }
}