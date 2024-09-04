import java.util.Scanner;

public class TaskThree {
    static void multiplicationTable(){
        try(Scanner scanner = new Scanner(System.in)){
            int num = 5;
            for (int i = 1; i < 11; i++) {
                int res = num * i;
                System.out.println(num + "*" + i + "=" + res);
            }
        }
    }
}
