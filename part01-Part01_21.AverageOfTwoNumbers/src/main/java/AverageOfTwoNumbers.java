
import java.util.Scanner;

public class AverageOfTwoNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give the first number: ");
        int n1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int n2 = Integer.valueOf(scanner.nextLine());
        double average = 1.0 * (n1 +n2)/2;
        System.out.println("The average is " + average);

    }
}
//    Give the first number:
//        8
//        Give the second number:
//        2
//        The average is 5.0