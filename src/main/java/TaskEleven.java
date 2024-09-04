import java.util.Scanner;

public class TaskEleven {
    static void factorial(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите число");
            int N = scanner.nextInt();
            if(N == 0 || N == 1){
                System.out.println(1);
            }
            else{
                int count = 1;
                while (N > 0) {
                    for (int i = 0; i < N; i--) {
                        count *= i;
                    }
                }

            }
        }
    }
}
