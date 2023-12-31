import java.util.Scanner;

public class UserInterface {
    private TodoList todoList;
    private Scanner scanner;

    public UserInterface(TodoList todoList, Scanner scanner) {
        this.todoList = todoList;
        this.scanner = scanner;
    }

    public void start() {
        while (true) {
            System.out.print("Command: ");
            String input = scanner.nextLine();
            if (input.equals("stop")) {
                break;
            } else if (input.equals("add")) {
                System.out.print("To add: ");
                String addInput = scanner.nextLine();
                todoList.add(addInput);
            } else if (input.equals("list")) {
                todoList.print();
            } else if (input.equals("remove")) {
                System.out.print("Which one is removed? ");
                int nrOfItem = Integer.valueOf(scanner.nextLine());
                todoList.remove(nrOfItem);
            } else {
                continue;
            }
        }
    }
}
