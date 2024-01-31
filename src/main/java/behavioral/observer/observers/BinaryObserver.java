package behavioral.observer.observers;

import behavioral.observer.subject.Subject;

public class BinaryObserver extends BaseObserver{
    public BinaryObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Değer değişti, yeni değerin binary değeri: " + Integer.toBinaryString(subject.getNumber()));
    }
}
