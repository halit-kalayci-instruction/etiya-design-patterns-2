package behavioral.chainofresponsibility.logging;

public class ConsoleLogger extends BaseLogger{
    @Override
    void log(String message) {
        System.out.println("Console'a loglandı:"+message);
    }
}
