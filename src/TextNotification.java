public class TextNotification extends Notification {
    private String recipient;
    private String smsProvider;

    public TextNotification(String subject, String body, String recipient, String smsProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smsProvider = smsProvider;
        showStatus();
    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmsProvider() {
        return smsProvider;
    }

    @Override
    public void transport() {
        System.out.println("---------------------------");
        System.out.println("Provider: " + getSmsProvider() + "\nRecipient: " + getRecipient() + "\nSubject: " + getSubject() + "\nBody: " + getBody() + "\nCreated At: " + getCreatedAt());
        System.out.println("---------------------------");

    }
}
