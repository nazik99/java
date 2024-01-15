import java.util.Scanner;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the numbers. Enter 0 to stop: ");
        int number = sc.nextInt();

        int amount = 1;
        while (number != 0) {  
            number = sc.nextInt();  
            if (number > 0) amount++;
        }
        
        System.out.println("You have entered " + amount + " numbers.");
        //System.out.println("Their sum is: " + getSum(number));
    }

    
}