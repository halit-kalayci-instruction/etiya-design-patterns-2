package creational.singleton;

public class DatabaseContext {
    private String databaseName;
    private static DatabaseContext instance;

    private DatabaseContext(String databaseName) {
        this.databaseName = databaseName;
    }

    public static DatabaseContext getInstance(String databaseName)
    {
        if(instance==null)
            instance = new DatabaseContext(databaseName);
        return instance;
    }

    public void connect() {
        System.out.println("Connected to:" + databaseName);
    }
}
