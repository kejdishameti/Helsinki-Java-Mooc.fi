
import java.util.Scanner;

public class AdditionFormula {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give the first number: ");
        int n1 = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number: ");
        int n2 = Integer.valueOf(scanner.nextLine());
        int x = n1 + n2;
        System.out.println( n1 + " + " + n2 +" = "+ x);


    }
}
//    Give the first number:
//        5
//        Give the second number:
//        4
//        5 + 4 = 9