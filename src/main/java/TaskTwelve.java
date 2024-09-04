import java.util.Scanner;

public class TaskTwelve {
    static void summOfDigits(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число");
            int num = scanner.nextInt();
            int count = 0;
            if(num == 0){
                count = 0;
            }
            else{
                while (num != 0){
                    count += num%10;
                    num /= 10;
                }
            }
            System.out.println(count);
        }
    }
}
