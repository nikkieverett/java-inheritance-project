public class EmailNotification extends Notification {
    private String recipient;
    private String smtpProvider;

    public EmailNotification(String subject, String body, String recipient, String smtpProvider) {
        super(subject, body);
        this.recipient = recipient;
        this.smtpProvider = smtpProvider;

    }

    public String getRecipient() {
        return recipient;
    }

    public String getSmtpProvider() {
        return smtpProvider;
    }

    @Override
    public void showStatus() {
        System.out.println("I'm overriding the show status method and making it public!");
    }
    @Override
    public void transport() {
        System.out.println("---------------------------");
        System.out.println("Provider: " + getSmtpProvider() + "\nRecipient: " + getRecipient() + "\nSubject: " + getSubject() + "\nBody: " + getBody() + "\nCreated At: " + getCreatedAt());
        System.out.println("---------------------------");

    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    protected Object clone(){
        EmailNotification clone = new EmailNotification(this.getSubject(), this.getBody(), this.getRecipient(), this.getSmtpProvider());
        return clone;
    }
}
