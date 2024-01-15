public class Task7 {
 
   public static void main(String[] args) {
       System.out.print("Enter an offer: ");
       String offer = System.console().readLine();
       
       System.out.print("Enter a word: ");
       String word = System.console().readLine();

       int index = offer.indexOf(word);
       
       System.out.print("we have found your word: " + index);
    
   }
}
 