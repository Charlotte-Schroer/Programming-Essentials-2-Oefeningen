package inheritance.challenge_at_home;

import java.time.LocalDateTime;

public class SimpleTextMessage extends Message {
    private String content;
    public SimpleTextMessage(String content){
        super();
        this.content = content;
    }
    public SimpleTextMessage(LocalDateTime postdatum, String content){
        super(postdatum);
        this.content = content;
    }
    public SimpleTextMessage(LocalDateTime postdatum, LocalDateTime einddatum, String content){
        super(postdatum, einddatum);
        this.content = content;
    }
    @Override
    public String getContent() {
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
}
