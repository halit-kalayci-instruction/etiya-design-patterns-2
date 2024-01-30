package structural.bridge.messages;

import structural.bridge.helpers.EmailSender;
import structural.bridge.helpers.MessageSender;

public class EmailMessage extends Message{

    public EmailMessage() {
        super(new EmailSender());
    }
}
