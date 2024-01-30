package structural.bridge.messages;

import structural.bridge.helpers.MessageSender;

public abstract class Message {
    protected MessageSender messageSender;

    public Message(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void send(String message){
        messageSender.sendMessage(message);
    }
}
