package structural.decorator.decorators;

import structural.decorator.models.User;

public abstract class UserDecorator implements User {
    protected User decoratedUser;

    public UserDecorator(User decoratedUser) {
        this.decoratedUser = decoratedUser;
    }

    public void doSomethingPremium() {
        System.out.println("Premium fonksiyon");
    }
    @Override
    public String getUsername() {
        return decoratedUser.getUsername();
    }

    @Override
    public String getPermissions() {
        return decoratedUser.getPermissions();
    }
}
