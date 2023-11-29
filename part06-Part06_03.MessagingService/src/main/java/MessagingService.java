import java.util.ArrayList;

public class MessagingService {
    private ArrayList<Message> msgService;

    public MessagingService() {
        this.msgService = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            this.msgService.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        return this.msgService;
    }
}
