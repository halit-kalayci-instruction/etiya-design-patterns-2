package behavioral.nullobject.logging;

public class DatabaseLogger implements Logging{
    @Override
    public void log(String message) {
        System.out.println("DB'e loglandı: " + message);
    }
}
