
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int n1 = scanner.nextInt();

        System.out.println("Where from?");
        int n2 = scanner.nextInt();

        for (int i=n2; i<=n1; i++) {
            System.out.println(i);
        }
    }
}
