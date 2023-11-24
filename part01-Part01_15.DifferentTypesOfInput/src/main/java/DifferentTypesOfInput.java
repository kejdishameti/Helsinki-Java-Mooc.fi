
import java.util.Scanner;

public class DifferentTypesOfInput {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a string: ");
        String v1 = scan.nextLine();

        System.out.println("Give an integer: ");
        int v2 = Integer.valueOf(scan.nextLine());

        System.out.println("Give a double: ");
        double v3 = Double.valueOf(scan.nextLine());

        System.out.println("Give a boolean: ");
        boolean v4 = Boolean.valueOf(scan.nextLine());

        System.out.println("You gave the string " + v1);
        System.out.println("You gave the integer " + v2);
        System.out.println("You gave the double " + v3);
        System.out.println("You gave the boolean " + v4);

    }
}
