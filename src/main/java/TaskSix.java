import java.util.Scanner;

public class TaskSix {
    static void checkSimpleNumber() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите число: ");
            int n = scanner.nextInt();
            boolean f = false;
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    f = false;
                } else if (n <= 1) {
                    f = false;
                } else {
                    f = true;
                }
            }
            if(f == false){
                System.out.println("Число не является простым");
            }
            else{
                System.out.println("Число является простым");
            }
        }
    }
}
