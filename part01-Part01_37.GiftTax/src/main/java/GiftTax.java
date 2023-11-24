
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Value of the gift?");
        int nr = Integer.valueOf(scan.nextLine());

        if(nr < 5000 ) {
            System.out.println("No tax!");
        } else if (nr <= 25000) {
            System.out.println("Tax: "+ (100 + (nr - 5000) * 0.08));
        } else if (nr <= 55000) {
            System.out.println("Tax: "+ (1700 + (nr - 25000) * 0.1));
        } else if (nr <= 200000) {
            System.out.println("Tax: "+ (4700 + (nr - 55000) * 0.12));
        } else if (nr <= 1000000) {
            System.out.println("Tax: "+ (22100 + (nr - 200000) * 0.15));
        } else {
            System.out.println("Tax: "+ (142100 + (nr - 1000000) * 0.17));
        }
    }
}
/*
Value of the gift?
3500
No tax!

Value of the gift?
27500
Tax: 1950.0
 */