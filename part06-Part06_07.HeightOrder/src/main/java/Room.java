import java.util.ArrayList;

public class Room {
    private ArrayList<Person> room;

    public Room() {
        this.room = new ArrayList<>();
    }

    public void add(Person person) {
        this.room.add(person);
    }

    public boolean isEmpty() {
        if (room.isEmpty()) {
            return true;
        }
        return false;
    }

    public ArrayList<Person> getPersons() {
        return this.room;
    }

    public  Person shortest() {
        if (room.isEmpty()) {
            return null;
        }
        Person shortest = room.get(0);
        for (Person person : room) {
            if (person.getHeight() < shortest.getHeight()) {
                shortest = person;
            }
        }
        return shortest;
    }

    public Person take() {
        if (room.isEmpty()) {
            return null;
        }
        Person takePerson = this.shortest();
        room.remove(takePerson);
        return takePerson;

    }
}
