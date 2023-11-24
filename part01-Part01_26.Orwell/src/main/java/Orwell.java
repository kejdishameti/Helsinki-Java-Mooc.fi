
import java.util.Scanner;

public class Orwell {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        int nr = Integer.valueOf(scan.nextLine());

        if (nr == 1984) {
            System.out.println("Orwell");
        }
    }
}
/*
Give a number:
1984
Orwell
 */