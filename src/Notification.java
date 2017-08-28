import java.time.LocalDateTime;

public class Notification {
    private LocalDateTime createdAt;
    private String subject;
    private String body;
    private String status;

    public Notification(String subject, String body){
        this.subject = subject;
        this.body = body;
        this.createdAt = LocalDateTime.now();
        this.status = "----Someone has read your message!---";
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public String getBody() {
        return body;
    }
    public String getSubject() {
        return subject;
    }

    protected void showStatus(){
        System.out.println(this.status);
    }


    public void transport(){
        throw new NoTransportException();
    }
    public class NoTransportException extends RuntimeException {}
}

