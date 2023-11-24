
import java.util.Scanner;

public class LineByLine {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] cope;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            cope = input.split(" ");

            for (int i = 0; i < cope.length; i++) {
                System.out.println(cope[i]);
            }

        }
    }
}
