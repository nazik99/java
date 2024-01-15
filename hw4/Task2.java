public class Task2 {
 
   public static void main(String[] args) {
       System.out.print("Enter an integer from 1 to 9: ");
       String calc = System.console().readLine();
       

       if (!calc.isBlank() || !calc.isEmpty()) {
        int calculator = Integer.parseInt(calc);
        
        int number = 2;
        int result = 0;

        while (number < 10) {
        result = number * calculator;
        System.out.printf("%d * %d = %d", calculator, number, result);
        System.out.println();
        number++; 
        } 
       }

       else{
        System.out.println("Answer can not be empty");
       }

   }
}