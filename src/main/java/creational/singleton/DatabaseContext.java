package creational.singleton;

public class DatabaseContext {
    private String databaseName;

    public DatabaseContext(String databaseName) {
        this.databaseName = databaseName;
    }

    public DatabaseContext getInstance(String databaseName)
    {
        // ilgili kontrol
        return new DatabaseContext(databaseName);
    }

    public void connect() {
        System.out.println("Connected to:" + databaseName);
    }
}
