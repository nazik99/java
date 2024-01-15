import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream; 
import java.util.stream.Stream; 

public class Cube {
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
                howMany = new int[]{1};
//                System.out.println(Arrays.toString(howMany));
                break;
 //               print("side 1: " + side[0]);
 //               return new int[]{1};
            case 1:
                howMany = new int[]{2};
 //               System.out.println(Arrays.toString(howMany));
                break;
 //               print("side 2: " + side[1]);
  //              return new int[]{2};
            case 2:
                howMany = new int[]{3};
  //              System.out.println(Arrays.toString(howMany));
                break;
 //               print("side 3: " + side[2]);
 //               return new int[]{3};
            case 3:
                howMany = new int[]{4};
  //              System.out.println(Arrays.toString(howMany));
                break;
 //               print("side 4: " + side[3]);
//                return new int[]{4}; 
            case 4:
                howMany = new int[]{5};
       //         System.out.println(Arrays.toString(howMany));
                break;
 //               print("side 5: " + side[4]);
 //               return new int[]{5};           
            case 5:
                default:
                howMany = new int[]{6};
          //      System.out.println(Arrays.toString(howMany));               
                break;        
 //               print("side 6: " + side[5]);
 //               return new int[]{6};
        }
        return howMany;
    }

    public static int[] rollTheDice2 () {
        int[] side2 = {1, 2, 3, 4, 5, 6};
        int[] howMany2;
        switch (rnd.nextInt(side2.length)) {
            case 0:
                howMany2 = new int[]{1};
 //               System.out.println(Arrays.toString(howMany2));
                break;
 //               print("side 1: " + side[0]);
 //               return new int[]{1};
            case 1:
                howMany2 = new int[]{2};
 //               System.out.println(Arrays.toString(howMany2));
                break;
 //               print("side 2: " + side[1]);
  //              return new int[]{2};
            case 2:
                howMany2 = new int[]{3};
 //               System.out.println(Arrays.toString(howMany2));
                break;
 //               print("side 3: " + side[2]);
 //               return new int[]{3};
            case 3:
                howMany2 = new int[]{4};
 //               System.out.println(Arrays.toString(howMany2));
                break;
 //               print("side 4: " + side[3]);
//                return new int[]{4}; 
            case 4:
                howMany2 = new int[]{5};
//                System.out.println(Arrays.toString(howMany2));
                break;
 //               print("side 5: " + side[4]);
 //               return new int[]{5};           
            case 5:
                default:
                howMany2 = new int[]{6};
 //               System.out.println(Arrays.toString(howMany2));
                break;        
 //               print("side 6: " + side[5]);
 //               return new int[]{6};
        }
        return howMany2;
    }

    public static int[] join(int[] a, int[] b){
        return IntStream.concat(Arrays.stream(a), Arrays.stream(b)).toArray();
}

    

}   