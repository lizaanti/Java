import java.util.Scanner;

public class TaskEighteen {
    static void countingVowelsAndConsonants(){
        try(Scanner scanner = new Scanner(System.in)){
            System.out.println("Введите строку");
            String str = scanner.nextLine();
            int vowelCount = 0;
            int consonantCount = 0;

            str = str.toLowerCase(); // Приводим строку к нижнему регистру

            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if ("aeiou".contains(String.valueOf(c))) {
                    vowelCount++;
                } else if (Character.isLetter(c) && !"aeiou".contains(String.valueOf(c))) {
                    consonantCount++;
                }
            }

            System.out.println("Количество гласных букв: " + vowelCount);
            System.out.println("Количество согласных букв: " + consonantCount);
        }
    }
}
