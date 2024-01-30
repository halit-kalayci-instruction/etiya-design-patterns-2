package structural.decorator.models;

public class BaseUser implements User{
    @Override
    public String getUsername() {
        return "base user";
    }

    @Override
    public String getPermissions() {
        return "user default permissions";
    }
}
