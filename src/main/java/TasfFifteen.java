import java.util.Scanner;

public class TasfFifteen {
    static void sumAllNumOfArray() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите длину массива: ");
            int len = scanner.nextInt();
            int[] array = new int[len];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < len; i++) {
                array[i] = scanner.nextInt();
            }
            int temp = 0;
            for (int j = 0; j < len; j++) {
                temp += array[j];
            }
            System.out.println(temp);
        }
    }
}
