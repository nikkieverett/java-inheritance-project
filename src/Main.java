public class Main {

    public static void main(String[] args) {
       EmailNotification myFirstEmail = new EmailNotification("Hello World", "Hey there how are you?","nikki.everett@outlook.com","ATT");
       TextNotification myFirstText = new TextNotification("Hey","What's up", "Trevor Root", "Sprint");

       myFirstEmail.transport();

       myFirstText.transport();

       myFirstEmail.showStatus();

       myFirstEmail.clone();
    }

}
