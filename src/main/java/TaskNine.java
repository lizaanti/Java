import java.util.Scanner;

public class TaskNine {
    static void reverseLine() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите строку");
            String str = scanner.nextLine();
            for (int i = str.length() - 1; i >= 0; i--) {
                System.out.print(str.charAt(i));
            }

            System.out.println();
        }
    }
}

