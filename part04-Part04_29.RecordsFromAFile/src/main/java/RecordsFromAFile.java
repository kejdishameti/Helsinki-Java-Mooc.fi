
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String input = scanner.nextLine();
        recordsFromFile(input);


    }

    public static void recordsFromFile(String fileName) {
        String row, name = "";
        String[] array;
        int age = 0;

        try (Scanner reader = new Scanner(Paths.get(fileName))) {
            while (reader.hasNextLine()) {
                row = reader.nextLine();
                array = row.split(",");
                name = array[0];
                age = Integer.valueOf(array[1]);

                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }

}
