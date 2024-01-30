package structural.bridge.helpers;

public class EmailSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Email ile gönderildi: " + message);
    }
}
