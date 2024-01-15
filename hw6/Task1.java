public class Task1 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = 4;

        float e = 2.4f;
        float f = 3.6f;
        float j = 10.1f;

        int d = getMax(a, b, c);
        System.out.println("Max: " + d);

        float s = getMax(e, f, j);
        System.out.println("Max: " + s);
    }

    public static int getMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static float getMax(float a, float b, float c) {
        return Math.max(a, Math.max(b, c));
    }
}