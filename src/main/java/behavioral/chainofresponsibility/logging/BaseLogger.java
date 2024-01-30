package behavioral.chainofresponsibility.logging;

public abstract class BaseLogger {
    public BaseLogger nextChain;

    public void setNextChain(BaseLogger nextChain) {
        this.nextChain = nextChain;
    }

    public void logWithChain(String message){
        log(message);

        if(nextChain!=null)
            nextChain.logWithChain(message);
    }

    abstract void log(String message);
}
