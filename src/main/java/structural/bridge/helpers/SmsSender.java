package structural.bridge.helpers;

public class SmsSender implements MessageSender{
    @Override
    public void sendMessage(String message) {
        System.out.println("Sms ile gönderildi:" + message);
    }
}
