package behavioral.chainofresponsibility.logging;

public class FileLogger extends BaseLogger{
    @Override
    void log(String message) {
        System.out.println("File'a loglandı:"+message);
    }
}
