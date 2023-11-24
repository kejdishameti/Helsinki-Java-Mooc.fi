
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, conut = 0, year = 0, temp = 0;
        int nameLength;
        String name = "";
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                break;
            }

            String[] cope = input.split(",");
            sum += Integer.valueOf(cope[1]);
            conut++;
            nameLength = cope[0].length();

            if (temp < nameLength) {
                temp = nameLength;
                name = cope[0];
            }


        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of the birth years: " + (1.0 * sum / conut));

    }
}
