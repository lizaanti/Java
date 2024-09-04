import java.util.Scanner;

public class TaskEleven {
    static void factorial(){
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число");
            int N = scanner.nextInt();
            long factorial = 1;
            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }

            System.out.println("Факториал числа " + N + " равен: " + factorial);
        }
    }
}
