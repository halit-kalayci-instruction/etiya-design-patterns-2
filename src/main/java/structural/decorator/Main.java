package structural.decorator;

import structural.decorator.decorators.PremiumUserDecorator;
import structural.decorator.decorators.UserDecorator;
import structural.decorator.models.BaseUser;
import structural.decorator.models.User;

public class Main {
    public static void main(String[] args) {
        User user = new BaseUser();
        System.out.println(user.getUsername());
        System.out.println(user.getPermissions());



        UserDecorator decoratedUser = new PremiumUserDecorator(new BaseUser());
        System.out.println(decoratedUser.getUsername());
        System.out.println(decoratedUser.getPermissions());
        decoratedUser.doSomethingPremium();
    }
}
