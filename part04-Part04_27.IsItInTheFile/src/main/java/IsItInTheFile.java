
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        boolean isFound = false;
        String row = "";
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();


        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();

        try (Scanner sc = new Scanner(Paths.get(file))) {
            while (sc.hasNextLine()) {
                row = sc.nextLine();
                if (searchedFor.equals(row)) {
                    isFound = true;
                    break;
                }
            }

            if (isFound) {
                System.out.println("Found!");
            } else {
                System.out.println("Not found.");
            }

        } catch (IOException e) {
            System.out.println("Reading the file " + file + " failed.");
        }

    }
}
