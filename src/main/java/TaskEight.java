import java.util.Scanner;

public class TaskEight {
    static void sumOfPositiveNumbers(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите два числа ");
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int summ = 0;
            for (int i = A; i <= B; i++) {
                if(i % 2 == 0){
                    summ += i;
                }
            }
            System.out.println(summ);
        }
    }
}
