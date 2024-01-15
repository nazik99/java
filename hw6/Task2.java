import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("Positiv: " + Arrays.toString(numbers));
        
        int[] d = getNegativ(numbers);
        System.out.println("Negativ: " + Arrays.toString(d));      
        
    }

    public static int[] getNegativ(int[] number) { 
        for (int i = 0; i < number.length; i++){
            number[i] = -1 * number[i];
        }
        return number;
    }

    
}