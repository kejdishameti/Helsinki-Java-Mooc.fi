import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokeManager;
    private Scanner scanner;

    public UserInterface(JokeManager jokeManager, Scanner scanner) {
        this.jokeManager = jokeManager;
        this.scanner = scanner;
    }

    public void start() {

        boolean shouldLoop = true;
        while (shouldLoop) {
            System.out.print("Commands:" + "\n"
                    + "1 - add a joke\n"
                    + "2 - draw a joke\n"
                    + "3 - list jokes\n"
                    + "X - stop\n");

            String userInput = scanner.nextLine();

            switch (userInput) {
                case "X":
                    shouldLoop = false;
                    break;
                case "1":

                    System.out.print("Write the joke to be added:");
                    String jokeToAdd = scanner.nextLine();
                    jokeManager.addJoke(jokeToAdd);

                    break;
                case "2":
                    System.out.println(jokeManager.drawJoke());

                    break;
                case "3":
                    jokeManager.printJokes();

                    break;
                default:
                    System.out.println("Unknown command");

            }

        }

    }

}
