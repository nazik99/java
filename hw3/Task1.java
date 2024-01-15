public class Task1 {
 
   public static void main(String[] args) {
       System.out.print("Enter the name of the football club: ");
       String name = System.console().readLine();
       System.out.println("Length: " + name.length());
       System.out.println("UpperCase: " + name.toUpperCase());
       System.out.println("LowerCase: " + name.toLowerCase());
   }
}
 