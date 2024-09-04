import java.util.Scanner;

public class TaskSixteen {
    static void sumOfnum() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите длину массива: ");
            int len = scanner.nextInt();
            int[] array = new int[len];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < len; i++) {
                array[i] = scanner.nextInt();
            }
            int countNeg = 0;
            int countPos = 0;
            for (int j = 0; j < len; j++) {
                if(array[j] >= 0){
                    countPos++;
                }
                else{
                    countNeg++;
                }
            }
            System.out.println(countNeg);
            System.out.println(countPos);
        }
    }
}
