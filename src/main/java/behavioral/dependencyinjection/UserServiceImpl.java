package behavioral.dependencyinjection;

public class UserServiceImpl implements UserService{

    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void add() {
        // Business Logic..
        // ...

        // veritabanı insert
    }
}
