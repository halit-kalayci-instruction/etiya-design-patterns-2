package creational.singleton;

import java.util.Random;

public class DatabaseContext {
    private String databaseName;
    private static DatabaseContext instance;

    private DatabaseContext(String databaseName) {

        //1-5 saniye
        Random  random = new Random();

        int randomMs = 1000 + random.nextInt(4001);

        try {
            Thread.sleep(randomMs);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

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
