import java.time.Year;

public class Task6 {
 
   public static void main(String[] args) {
       int currentYear = Year.now().getValue();
       int minyear = 1903;
       System.out.print("Your name: ");
       String name = System.console().readLine();
       String cleanText = name.strip();

       System.out.print("Your Last name: ");
       String lastName = System.console().readLine();
       String cleanText2 = lastName.strip();

       System.out.print("Your country: ");
       String country = System.console().readLine();
       String cleanText3 = country.strip();

       System.out.print("Year of birth: ");
       String birth = System.console().readLine();
       int asInt = Integer.parseInt(birth);

       if (asInt < minyear){
       System.out.print("You entered an incorrect year of birth!");
       }
       
       int old = currentYear - asInt;

       System.out.printf("Your name is %S %S. And you %d years old, and you are from in %s", cleanText, cleanText2, old, cleanText3);
   }
}