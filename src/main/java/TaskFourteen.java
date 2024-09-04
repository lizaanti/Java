import java.util.Scanner;

public class TaskFourteen {
    static void maxNumInArr(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.print("Введите длину массива: ");
            int len = scanner.nextInt();
            int[] array = new int[len];
            System.out.println("Введите элементы массива:");
            for (int i = 0; i < len; i++) {
                array[i] = scanner.nextInt();
            }
            int max = array[0];
            for (int j = 0; j < len; j++) {
                if(max < array[j]){
                    max = array[j];
                }
            }
            System.out.println(max);
        }
    }
}
