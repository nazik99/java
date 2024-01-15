import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream; 
import java.util.stream.Stream; 

public class Cube3 {
    public static Random rnd = new Random();
 
    public static void main(String[] args) {
    System.out.print("Predict amount of points 2 to 12: ");
    String n = System.console().readLine();
    System.out.println("User rolls the dices...");

    int[] words = rollTheDice(); 
    int[] words2 = rollTheDice2();
    
    int[] s = join(words, words2);
    int sum = Arrays.stream(s).sum();

    if (!n.isBlank() || !n.isEmpty()) {
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words2));
        System.out.println("on the dice fell " + sum + " points.");

        int number = Integer.parseInt(n);
        int totalPoint = sum-Math.abs(sum-number)*2;

        System.out.println("Result is " + sum + "-abs(" + sum + "-" + number + ")*2: " + totalPoint);

        if (totalPoint>0){
            System.out.println("User wins!");
        }
        else{
            System.out.println("Sorry!");
        }
    } 
    else{
        System.out.println("Answer can not be empty");
    }
   }

    public static int[] rollTheDice () {
        int[] side = {1, 2, 3, 4, 5, 6};
        int[] howMany;
        switch (rnd.nextInt(side.length)) {
            case 0:
                howMany = new int[]{
                    "* * * * *",
                    "*       *",
                    "*   #   *",
                    "*       *",
                    "* * * * *"
                };
                System.out.println(Arrays.toString(howMany));
                break;
            case 1:
                howMany = new int[]{
                    "* * * * *", 
                    "*    #  *",
                    "*       *",
                    "*  #    *",
                    "* * * * *"
                };
                System.out.println(Arrays.toString(howMany));
                break;
            case 2:
                howMany = new int[]{
                    "* * * * *", 
                    "*    #  *",
                    "*   #   *",
                    "*  #    *",
                    "* * * * *"  
                };
                System.out.println(Arrays.toString(howMany));
                break;
            case 3:
                howMany = new int[]{
                    "* * * * *", 
                    "* #   # *",
                    "*       *",
                    "* #   # *",
                    "* * * * *"
                };
                System.out.println(Arrays.toString(howMany));
                break;
 
            case 4:
                howMany = new int[]{
                    "* * * * *", 
                    "* #   # *",
                    "*   #   *",
                    "* #   # *",
                    "* * * * *"
                };
                System.out.println(Arrays.toString(howMany));
                break;          
            case 5:
                default:
                howMany = new int[]{
                    "* * * * *", 
                    "* # # # *",
                    "*       *",
                    "* # # # *",
                    "* * * * *"
                };
                System.out.println(Arrays.toString(howMany));              
                break;        
        }
        return howMany;
    }

    public static int[] rollTheDice2 () {
        int[] side2 = {1, 2, 3, 4, 5, 6};
        int[] howMany2;
        switch (rnd.nextInt(side2.length)) {
            case 0:
                howMany2 = new int[]{
                    "* * * * *",
                    "*       *",
                    "*   #   *",
                    "*       *",
                    "* * * * *"
                };
                break;
            case 1:
                howMany2 = new int[]{
                    "* * * * *", 
                    "*    #  *",
                    "*       *",
                    "*  #    *",
                    "* * * * *"
                };
                break;
            case 2:
                howMany2 = new int[]{
                    "* * * * *", 
                    "*    #  *",
                    "*   #   *",
                    "*  #    *",
                    "* * * * *"  
                };
                break;
            case 3:
                howMany2 = new int[]{
                    "* * * * *", 
                    "* #   # *",
                    "*       *",
                    "* #   # *",
                    "* * * * *"
                };
                break;
 
            case 4:
                howMany2 = new int[]{
                    "* * * * *", 
                    "* #   # *",
                    "*   #   *",
                    "* #   # *",
                    "* * * * *"
                };
                break;          
            case 5:
                default:
                howMany2 = new int[]{
                    "* * * * *", 
                    "* # # # *",
                    "*       *",
                    "* # # # *",
                    "* * * * *"
                };              
                break;        
        }
        return howMany2;
    }

    public static int[] join(int[] a, int[] b){
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
}

    

}