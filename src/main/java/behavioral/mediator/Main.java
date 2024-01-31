package behavioral.mediator;

import behavioral.mediator.mediator.ChatMediator;
import behavioral.mediator.mediator.Mediator;
import behavioral.mediator.models.User;

public class Main {
    public static void main(String[] args) {
        Mediator chatMediator = new ChatMediator();

        User user1 = new User(1,"Halit");
        User user2 = new User(2,"Batuhan");
        User user3 = new User(3,"Melike");
        User user4 = new User(4,"Beyza");

        chatMediator.sendMessage("Merhaba", user1,user2);
        chatMediator.sendMessage("Selam", user3,user4);
    }
}
