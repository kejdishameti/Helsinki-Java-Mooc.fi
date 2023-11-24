
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long result = 1;
        System.out.println("Give a number: ");
        int nr = scanner.nextInt();

        for (int i = 1; i <= nr; i++) {
            result *= i;
        }
        System.out.printf("Factorial: " + result);
    }
}
