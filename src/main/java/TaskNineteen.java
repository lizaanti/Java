import java.util.Scanner;

public class TaskNineteen {
    static void reverseWordsOrder(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите предложение");
            String str = scanner.nextLine();
            String[] words = str.split(" ");
            for (int i = words.length - 1; i >= 0; i--) {
                System.out.print(words[i] + " ");
            }
            System.out.println(words);
        }
    }
}
