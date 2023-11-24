
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] cope = input.split(",");
            int age = Integer.valueOf(cope[1]);

            if (age > n) {
                n = age;
                name = cope[0];
            }

        }
        System.out.println("Name of the oldest: " + name);
    }
}
