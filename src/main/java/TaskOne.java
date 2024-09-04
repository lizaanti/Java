import java.util.Scanner;

public class TaskOne {

    static void checkingForAnEvenNumber() {
        try (Scanner scanner = new Scanner(System.in)) { //конструкция, которая позволяет автоматически закрывать ресурс
            System.out.println("Введите число: ");
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                System.out.println("Заданное Вами число четное");
            } else {
                System.out.println("Заданное Вами число нечетное");
            }
        }
    }
}
