package behavioral.dependencyinjection;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(new UserRepositoryImpl());
        // IoC, DI Container
    }
}
