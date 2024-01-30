package behavioral.chainofresponsibility.logging;

public class DBLogger extends BaseLogger{
    @Override
    void log(String message) {
        System.out.println("DB'e loglandı:"+message);
    }
}
