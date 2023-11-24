
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr = Integer.valueOf(scanner.nextLine());

        if(nr < 0) {
            System.out.println(nr *(-1));
        } else {
            System.out.println(nr);
        }
    }
}
