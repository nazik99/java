public class Task5 {
 
   public static void main(String[] args) {
    //    float p = 3.14f;
       System.out.print("enter the radius of the circle: ");
       String radius = System.console().readLine();
       double asDouble = Double.parseDouble(radius);

       System.out.print("enter the side of the square A: ");
       String aSide = System.console().readLine();
       double asDouble2 = Double.parseDouble(aSide);

       double s = Math.PI * Math.pow(asDouble, 2);

       double s2 = Math.pow(asDouble2, 2);

       if (s>s2){
        System.out.print("The area of a circle is greater than the area of a square: " + s  + 
        " > " + s2);
       }
       else {
        System.out.print("The area of a square is greater than the area of a circle: " + s2 + 
        " > " + s);
       }
       

   }
}