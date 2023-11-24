
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr = scanner.nextInt();

        for (int i = nr; i<=100; i++) {
            System.out.println(i);
        }
    }
}
