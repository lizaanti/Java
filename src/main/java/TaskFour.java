import java.util.Scanner;

public class TaskFour {

    static void sumOfNumbers(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число N");
            int N = scanner.nextInt();
            int res = 0;
            for (int i = 0; i < N; i++) {
                res += i;

            }
            System.out.printf("Ваша сумма числе равна %d", res);
        }
    }
}
