
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] cope = input.split(",");
            int age = Integer.valueOf(cope[1]);

            if (age > n) {
                n = age;
            }

        }
        System.out.println("Age of the oldest: " + n);

    }
}
