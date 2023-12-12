import java.util.Scanner;

public class TextUI {
    private Scanner scanner;
    private SimpleDictionary dir;

    public TextUI(Scanner scanner, SimpleDictionary dir) {
        this.scanner = scanner;
        this.dir = dir;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.print("Bye bye!");
                break;
            } else if (input.equals("add")) {
                System.out.print("Word: ");
                String word = scanner.nextLine();
                System.out.print("Translation: ");
                String translation = scanner.nextLine();
                dir.add(word, translation);
            } else if (input.equals("search")) {
                System.out.println("To be translated: ");
                String toBeTranslated = scanner.nextLine();
                String translatedWord = dir.translate(toBeTranslated);
                if (translatedWord == null) {
                    System.out.println("Word " + toBeTranslated + " was not found");
                } else {
                    System.out.print("Translation: " + translatedWord);
                }
            } else {
                System.out.print("Unknown command");
            }
        }
    }
}
