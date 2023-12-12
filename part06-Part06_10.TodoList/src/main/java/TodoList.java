import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> toDoList;

    public TodoList() {
        toDoList = new ArrayList<>();
    }
    public void add(String task) {
        toDoList.add(task);
    }

    public void print() {
        for (String item : toDoList) {
            System.out.println((toDoList.indexOf(item) + 1) + ": " + item);
        }
    }

    public void remove(int number) {
        toDoList.remove(number - 1);
    }
}
