
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("Last number?");
        int nr = scanner.nextInt();

        for (int i = 1; i <= nr; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
