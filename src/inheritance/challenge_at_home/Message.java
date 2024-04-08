package inheritance.challenge_at_home;

import java.time.LocalDateTime;


public abstract class Message {
    private final LocalDateTime postdatum;
    private  LocalDateTime einddatum;

    public Message(){
        this.postdatum = LocalDateTime.now();
    }
    public Message(LocalDateTime postdatum){
        this.postdatum = postdatum;
    }
    public Message(LocalDateTime postdatum, LocalDateTime einddatum ){
        this.postdatum = postdatum;
        this.einddatum = einddatum;
    }


    public LocalDateTime getPostdatum() {
        return postdatum;
    }

    public LocalDateTime getEinddatum() {
        return einddatum;
    }

    public void setEinddatum(LocalDateTime einddatum) {
        this.einddatum = einddatum;
    }

    public boolean isExpired(){
        return LocalDateTime.now().isAfter(einddatum);
    }
    public boolean isPosted(){
        return LocalDateTime.now().isAfter(postdatum);
    }
    abstract public String getContent();
}
