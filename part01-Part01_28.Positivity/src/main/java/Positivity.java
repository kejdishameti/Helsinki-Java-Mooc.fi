
import java.util.Scanner;

public class Positivity {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a number: ");
        int nr = Integer.valueOf(scan.nextLine());

        if (nr <= 0) {
            System.out.println("The number is not positive.");
        } else {
            System.out.println("The number is positive.");
        }
    }
}
/*
Give a number:
5
The number is positive.
 */