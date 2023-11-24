
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalInformationCollection {

    public static void main(String[] args) {
        // implement here your program that uses the PersonalInformation class
        Scanner scanner = new Scanner(System.in);
        ArrayList<PersonalInformation> infoCollection = new ArrayList<>();
        while (true) {
            System.out.print("First name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.print("Last name: ");
            String surname = scanner.nextLine();
            System.out.print("Identification number: ");
            String nr = scanner.nextLine();
            infoCollection.add(new PersonalInformation(name, surname, nr));
        }
        System.out.println();
        for (PersonalInformation person : infoCollection) {
            System.out.println(person.getFirstName() + " " + person.getLastName());
        }

    }
}
