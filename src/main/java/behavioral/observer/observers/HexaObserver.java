package behavioral.observer.observers;

import behavioral.observer.subject.Subject;

public class HexaObserver extends BaseObserver{
    public HexaObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Değer değişti, yeni değerin hexadecimal değeri: " + Integer.toHexString(subject.getNumber()));
    }
}
