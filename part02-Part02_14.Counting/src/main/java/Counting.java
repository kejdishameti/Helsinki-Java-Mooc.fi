
import java.util.Scanner;

public class Counting {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nr = Integer.valueOf(scanner.nextLine());

        for(int i = 0;  i <= nr; i = i +1) {
            System.out.println(i);
        }
    }
}
