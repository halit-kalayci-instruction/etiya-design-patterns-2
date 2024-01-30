package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.patterns.LoggingChainPattern;

public class Main {
    public static void main(String[] args) {
        LoggingChainPattern.getLoggerChain().logWithChain("Bir kayıt eklendi.");
    }
}
