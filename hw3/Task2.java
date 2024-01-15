public class Task2 {
 
   public static void main(String[] args) {
    System.out.print("Enter the last name 1: ");
    String lastName = System.console().readLine();

    System.out.print("Enter the last name 2: ");
    String lastName2 = System.console().readLine();

    if (!lastName.isEmpty() && !lastName2.isEmpty()) {
    int length = lastName.length();
    int length2 = lastName2.length();

    if (length > length2){
      System.out.println("The 1 Lastname is longer than the 2 Lastname");
    }
    else if (length < length2){
      System.out.println("The 2 Lastname is longer than the 1 Lastname");
    }
    else if (length == length2){
      System.out.println("Length 1 Lastname = Length 2 Lastname");
    }
    System.out.println("Length Last name 1: " + length + "\nLength Last name 2: " + length2);  
    }  

   else {
    System.out.print("You haven't entered anything!");
   }


    
   }
}