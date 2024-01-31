package behavioral.mediator.mediator;

import behavioral.mediator.models.User;

public class ChatMediator implements Mediator{
    @Override
    public void sendMessage(String msg, User sender, User receiver) {
        // Pipeline
        System.out.println(msg + " mesajı "  + sender.getName() + " tarafından " + receiver.getName() +" isimli kullanıcıya gönderildi..");
    }
}
