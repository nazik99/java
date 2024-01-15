import java.util.Scanner;

public class Task2 {
 
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите натуральное число N 10<=n<=1000000: ");
      int number = sc.nextInt();
      
      int[] arr = new int[6];

      for (int i = 0; i < 6; ++i) {
        arr[i] += number % 10;
        number /= 10;
      }

   //  for (int i : arr) {
   //      System.out.print(i);
   //  }
      for (int i = arr.length - 1; i >= 0 ; i--) {
            System.out.print(arr[i]);
      }
      System.out.println();

      System.out.println();

      int sum = 0;
      for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
      }
      System.out.println("Сумма всех чисел: " + sum);

      System.out.println();

      for (int numb : arr){
        if (numb % 2 == 0){
            System.out.println("Чётные числа: " + numb);
         }   
      }


   }
}