package structural.bridge;

import structural.bridge.messages.EmailMessage;
import structural.bridge.messages.SmsMessage;

public class Main {
    public static void main(String[] args) {
        EmailMessage message = new EmailMessage();
        message.send("Merhaba");

        SmsMessage smsMessage = new SmsMessage();
        smsMessage.send("Selam");
    }
}
