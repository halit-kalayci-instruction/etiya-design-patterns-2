package behavioral.mediator.mediator;

import behavioral.mediator.models.User;

public interface Mediator {
    void sendMessage(String msg, User sender, User receiver);
}
