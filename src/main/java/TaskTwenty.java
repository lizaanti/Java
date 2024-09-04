import java.util.Scanner;

public class TaskTwenty {
    static void armstrong(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Введите целое число: ");
            int num = scanner.nextInt();

            int originalNum = num;
            int sum = 0;
            int numDigits = 0;

            while (num > 0) {
                numDigits++;
                num /= 10;
            }

            num = originalNum;

            while (num > 0) {
                int digit = num % 10;
                sum += Math.pow(digit, numDigits);
                num /= 10;
            }

            if (sum == originalNum) {
                System.out.println(originalNum + " является числом Армстронга");
            } else {
                System.out.println(originalNum + " не является числом Армстронга");
            }
        }
    }
}
