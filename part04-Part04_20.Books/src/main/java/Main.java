import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> books = new ArrayList<>();

        while (true) {
            System.out.print("Title: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.print("Publication year: ");
            int publicationYear = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, pages, publicationYear));

        }
        System.out.println();
        System.out.print("What information will be printed? ");
        String input = scanner.nextLine();
        for (Book book : books) {
            if (input.equals("everything")) {
                System.out.println(book.getInstanceName() + ", " + book.getInstancePages() + " pages, " +
                        book.getInstancePublicationYear());
            } else if (input.equals("name")) {
                System.out.println(book.getInstanceName());
            }
        }
    }
}
