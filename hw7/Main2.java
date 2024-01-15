import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream; 
import java.util.stream.Stream; 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main2 {
    public static Random rnd = new Random();
 
    public static void main(String[] args) {
    System.out.print("Predict amount of points 2 to 12: ");
    String n = System.console().readLine();
    System.out.println("User rolls the dices...");

    String[] words = rollTheDice(); 
    String[] words2 = rollTheDice2();
    
    List<String> list = new ArrayList<String>(Arrays.asList(words));
      list.addAll(Arrays.asList(words2));
      Object[] c = list.toArray();

    if (!n.isBlank() || !n.isEmpty()) {
        System.out.println(Arrays.toString(words));
        System.out.println(Arrays.toString(words2));
        System.out.println("on the dice fell " + c + " points.");

        int number = Integer.parseInt(n);
        //int totalPoint = c-Math.abs(number)*2;

        //System.out.println("Result is " + c + "-abs(" + c + "-" + number + ")*2: " + totalPoint);

       // if (totalPoint>0){
         //   System.out.println("User wins!");
        //}
       // else{
       //     System.out.println("Sorry!");
       // }
    } 
    else{
        System.out.println("Answer can not be empty");
    }
   }

    public static String[] rollTheDice () {
        int[] side = {1, 2, 3, 4, 5, 6};
        String[] howMany;
        switch (rnd.nextInt(side.length)) {
            case 0:
                howMany = new String[]{
                    "* * * * *",
                    "*       *",
                    "*   #   *",
                    "*       *",
                    "* * * * *"
                };
                break;
            case 1:
                howMany = new String[]{
                    "* * * * *", 
                    "*    #  *",
                    "*       *",
                    "*  #    *",
                    "* * * * *"
                };
               
                break;
            case 2:
                howMany = new String[]{
                    "* * * * *", 
                    "*    #  *",
                    "*   #   *",
                    "*  #    *",
                    "* * * * *"  
                };
                
                break;
            case 3:
                howMany = new String[]{
                    "* * * * *", 
                    "* #   # *",
                    "*       *",
                    "* #   # *",
                    "* * * * *"
                };
               
                break;
 
            case 4:
                howMany = new String[]{
                    "* * * * *", 
                    "* #   # *",
                    "*   #   *",
                    "* #   # *",
                    "* * * * *"
                };
               
                break;          
            case 5:
                default:
                howMany = new String[]{
                    "* * * * *", 
                    "* # # # *",
                    "*       *",
                    "* # # # *",
                    "* * * * *"
                };
                             
                break;        
        }
        return howMany;
    }

    public static String[] rollTheDice2 () {
        int[] side2 = {1, 2, 3, 4, 5, 6};
        String[] howMany2;
        switch (rnd.nextInt(side2.length)) {
            case 0:
                howMany2 = new String[]{
                    "* * * * *",
                    "*       *",
                    "*   #   *",
                    "*       *",
                    "* * * * *"
                };
                break;
            case 1:
                howMany2 = new String[]{
                    "* * * * *", 
                    "*    #  *",
                    "*       *",
                    "*  #    *",
                    "* * * * *"
                };
                break;
            case 2:
                howMany2 = new String[]{
                    "* * * * *", 
                    "*    #  *",
                    "*   #   *",
                    "*  #    *",
                    "* * * * *"  
                };
                break;
            case 3:
                howMany2 = new String[]{
                    "* * * * *", 
                    "* #   # *",
                    "*       *",
                    "* #   # *",
                    "* * * * *"
                };
                break;
 
            case 4:
                howMany2 = new String[]{
                    "* * * * *", 
                    "* #   # *",
                    "*   #   *",
                    "* #   # *",
                    "* * * * *"
                };
                break;          
            case 5:
                default:
                howMany2 = new String[]{
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
}