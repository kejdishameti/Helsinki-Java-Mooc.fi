
import java.util.Scanner;

public class OnlyPositives {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Give a number: ");
            int nr = Integer.valueOf(scanner.nextLine());

            if (nr == 0) {
                break;
            }
            if (nr < 0) {
                System.out.println("Unsuitable number");
                continue;
            }
            System.out.println(nr * nr);
        }
    }
}
/*
Give a number:
4
16
Give a number:
-3
Unsuitable number
 */