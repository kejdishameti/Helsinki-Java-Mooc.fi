
import java.util.Scanner;

public class Ancient {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give a year: ");
        int nr = Integer.valueOf(scan.nextLine());

        if(nr < 2015) {
            System.out.println("Ancient history!");
        }
    }
}
/*
Give a year:
2013
Ancient history!
 */