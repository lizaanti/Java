import java.util.Scanner;

public class TaskSeven {
    static void reverseOrder(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число");
            int N = scanner.nextInt();
            for (int i = 0; i < N ; i++) {
                System.out.println(N-i + " ");
            }
        }
    }
}
