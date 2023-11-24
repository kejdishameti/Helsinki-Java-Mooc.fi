
import java.util.Scanner;

public class SumOfASequenceTheSequel {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        System.out.println("First number?");
        int n1 = scanner.nextInt();

        System.out.println("First number?");
        int n2 = scanner.nextInt();
        for (int i = n1; i <= n2; i++) {
            sum += i;
        }
        System.out.println("The sum is " + sum);
    }
}
