import java.util.Scanner;

public class TaskSeventeen {
    static void sumOfSimpleNumInDiap() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Введите два числа ");
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            for (int i = A; i <= B; i++) {
                boolean isPrime = true;

                if (i <= 1) {
                    isPrime = false;
                } else {
                    for (int j = 2; j <= Math.sqrt(i); j++) {
                        if (i % j == 0) {
                            isPrime = false;
                            break;
                        }
                    }
                }

                if (isPrime) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
        }
    }
}