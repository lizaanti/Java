import java.util.Arrays;
import java.util.Scanner;

public class TaskThirteen {
    static void palindrom(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите строку");
            String str = scanner.nextLine();
            str = str.replaceAll("\\s", "").toLowerCase();
            int left = 0;
            int right = str.length() - 1;

            while (left < right) {
                if (str.charAt(left) != str.charAt(right)) {
                    System.out.println("Строка является палиндроном");;
                }
                left++;
                right--;
            }
             if(str.charAt(left) == str.charAt(right)){
                System.out.println("Строка не является палиндроном");
            }
        }
    }
}
