import java.util.Scanner;

public class Task1 {
 
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите зарплату первого сотрудника: ");
        int answer = sc.nextInt();

        System.out.println("Введите зарплату второго сотрудника: ");
        int answer2 = sc.nextInt();

        System.out.println("Введите зарплату третьего сотрудника: ");
        int answer3 = sc.nextInt();

        System.out.println("Введите зарплату четвертого сотрудника: ");
        int answer4 = sc.nextInt();

        System.out.println("Введите зарплату пятого сотрудника: ");
        int answer5 = sc.nextInt();

        int summer = answer+answer2+answer3+answer4+answer5;
        
        int maximum = Math.max(answer, answer2);
        int maximum2 = Math.max(answer3, answer4);
        int maximum3 = Math.max(answer5, maximum);
        int maximum4 = Math.max(maximum2, maximum3);

        int minimum = Math.min(answer, answer2);
        int minimum2 = Math.min(answer3, answer4);
        int minimum3 = Math.min(answer5, minimum);
        int minimum4 = Math.min(minimum2, minimum3);
        
        int amp = maximum4 - minimum4;

        System.out.printf("Максимум: %,d%n ", maximum4);
        System.out.printf("Минимум : %,d%n ", minimum4);
        System.out.printf("Разница : %,d%n ", amp);
        System.out.printf("Общая сумма : %,d%n ", summer);

   }
}