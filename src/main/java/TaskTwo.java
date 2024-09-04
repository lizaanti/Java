import java.util.Scanner;

public class TaskTwo {
    static void FindMinNum(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите три числа: ");
            int firstNum = scanner.nextInt();
            int secondNum = scanner.nextInt();
            int thirdNum = scanner.nextInt();
            int temp = firstNum;
            if(temp > secondNum){
                temp = secondNum;
                if(temp > thirdNum){
                    temp = thirdNum;
                }
            }
            System.out.printf("Минимальное число равно %d", temp);
        }
    }
}
