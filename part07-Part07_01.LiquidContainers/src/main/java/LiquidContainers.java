
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstContaniner = 0;
        int secondContainer = 0;

        while (true) {
            System.out.println("First: " + firstContaniner + "/100");
            System.out.println("Second: " + secondContainer + "/100");

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int value = Integer.valueOf(parts[1]);


            if (value < 0) {
                continue;
            }

            if (command.contains("add")) {
                if (firstContaniner + value > 100) {
                    firstContaniner += 100;
                } else {
                    firstContaniner += value;
                }
            }

            if (command.contains("move")) {
                if (firstContaniner < 0 ) {
                    
                } else if (firstContaniner - value) {
                    
                }
            }
        }
    }

}
