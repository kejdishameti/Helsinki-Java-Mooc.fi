
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nrOfNr = 0;
        int sum = 0;

        while (true) {

            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            }

            if (num > 0) {
                nrOfNr = nrOfNr + 1;
                sum = sum + num;
            }
        }
        if (nrOfNr == 0) {
            System.out.println("Cannot calculate the average");
        }
        System.out.println( 1.0 * sum / nrOfNr);
    }
}
