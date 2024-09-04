import java.util.Scanner;

public class TaskFive {
    static void fibonacciNumber(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число ");
            int n = scanner.nextInt();
            int[] fib = new int[n];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i < n; i++){
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.println("Последовательность первых чисел ровна ");
            for (int i = 0; i < n; i++) {
                System.out.println(fib[i] + " ");
            }
        }
    }
}
