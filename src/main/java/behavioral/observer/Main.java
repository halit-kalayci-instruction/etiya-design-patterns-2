package behavioral.observer;

import behavioral.observer.observers.BinaryObserver;
import behavioral.observer.observers.HexaObserver;
import behavioral.observer.observers.OctalObserver;
import behavioral.observer.subject.Subject;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Subject();
        BinaryObserver binaryObserver = new BinaryObserver(subject);
        HexaObserver hexaObserver = new HexaObserver(subject);
        OctalObserver octalObserver = new OctalObserver(subject);
        subject.setNumber(5);

        subject.setNumber(20);
    }
}
// Open/Closed Principle