
import java.util.Scanner;

public class AverageOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int n1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the second number: ");
        int n2 = Integer.valueOf(scanner.nextLine());

        System.out.println("Give the third number: ");
        int n3 = Integer.valueOf(scanner.nextLine());

        double average = 1.0 * (n1 +n2 +n3)/3;
        System.out.println("The average is " + average);

    }
}
/*
Give the first number:
8
Give the second number:
2
Give the third number:
3
The average is 4.333333333333333
 */