
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.print("From where?");
        int num1 = scanner.nextInt();
        System.out.print("From where?");
        int num2 = scanner.nextInt();


        for (int j = num1; j <= num2; j++) {
            System.out.println(numbers.get(j));
        }


    }
}
