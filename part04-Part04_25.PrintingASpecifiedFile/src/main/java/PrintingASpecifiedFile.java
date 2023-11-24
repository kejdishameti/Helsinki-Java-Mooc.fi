
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which file should have its contents printed?");

        String filename;
        filename = scanner.nextLine();
        findFile(filename);
    }
    public static void findFile(String filename) {
        try (Scanner scann = new Scanner(Paths.get(filename))) {

            while (scann.hasNextLine()) {
                String row = scann.nextLine();
                System.out.println(row);
            }

        } catch (IOException e) {
            throw new RuntimeException("Error " + e);
        } ;
    }
}
