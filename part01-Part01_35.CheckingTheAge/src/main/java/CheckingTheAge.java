
import java.util.Scanner;

public class CheckingTheAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("How old are you?");
        int nr = Integer.valueOf(scan.next());

        if(nr<0 || nr>120) {
            System.out.println("Impossible!");
        } else {
            System.out.println("OK");
        }
    }
}
/*
How old are you? 10
OK
 */