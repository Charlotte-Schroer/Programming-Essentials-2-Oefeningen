package inheritance.challenge_at_home;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private List<Message> messages;
    public Board(){
        messages = new ArrayList<>();
    }
    public void  postMessage(Message message){
        messages.add(message);
    }
    public Message getMessage( int index){
        return messages.get(index);
    }
    public void removeMessage(int index){
        messages.remove(index);
    }
}
