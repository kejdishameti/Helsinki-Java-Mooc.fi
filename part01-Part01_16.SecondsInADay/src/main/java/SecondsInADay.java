
import java.util.Scanner;

public class SecondsInADay {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many days would you like to convert to seconds?");
        int days = Integer.valueOf(scanner.nextLine());
        int daysInSeconds = days * 86400;
        System.out.println(daysInSeconds);

    }
}
//    How many days would you like to convert to seconds?
//        1
//        86400