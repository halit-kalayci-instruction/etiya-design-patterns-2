package structural.bridge.messages;

import structural.bridge.helpers.MessageSender;
import structural.bridge.helpers.SmsSender;

public class SmsMessage extends Message{
    public SmsMessage() {
        super(new SmsSender());
    }
}
