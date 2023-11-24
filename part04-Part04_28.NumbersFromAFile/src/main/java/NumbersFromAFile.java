
import java.io.IOException;
import java.nio.file.ClosedWatchServiceException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.SortedMap;

public class NumbersFromAFile {
    private static int counter;

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        int counter = 0;
        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                list.add(sc.nextLine());

            }
        } catch (IOException ex) {
            System.out.println("Error: " + ex.getMessage());

        }
        for (String item : list) {
            int number = Integer.valueOf(item);

            if (number >= lowerBound && number <= upperBound) {
                counter++;
            } else {
                continue;
            }
        }
        System.out.println("Numbers: "+ counter);

    }

}
