public class Task3 {
 
   public static void main(String[] args) {
       float hour = 3.6f;
       System.out.print("Enter kilometer per hour: ");
       String kilometer = System.console().readLine();
       double asDouble = Double.parseDouble(kilometer);

       System.out.print("Enter meter per second: ");
       String meter = System.console().readLine();
       double asDouble2 = Double.parseDouble(meter);

       double kilMeter = asDouble / hour;

       if (kilMeter > asDouble2){
        System.out.print(kilMeter + " km/h is longer than m/sec" + meter);
       }
       else{
        System.out.print(meter + " m/sec is longer than km/h" + kilMeter);
       }


   }
}