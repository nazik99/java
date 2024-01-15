import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        double x = 2;
        double y = 3;
        double z = 4;

        int v = 2;
        int n = 3;
        int p = 4;

        System.out.println("Max: " + solution(x, y, z));
        System.out.println("boolean: " + getSolution(v, n, p));

    }
    public static double solution(double x, double y, double z){
        double a = Math.abs(x)-Math.abs(y);
        double b = Math.abs(y)-Math.abs(z);
        double c = Math.abs(z)-Math.abs(x);

        double max = Math.max(a, Math.max(b,c));

        return max;
    }

    public static boolean getSolution(int x, int y, int z){
        double u = Math.pow(x, 2); 
        double j = Math.pow(y, 2);
        double h = Math.pow(z, 2);
        double summery = u + j;
        if(summery==h){
            return true;
        }
        else {
            return false;
        }
    }
    
}