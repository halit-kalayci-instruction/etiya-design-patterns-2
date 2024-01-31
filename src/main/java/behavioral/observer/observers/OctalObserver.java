package behavioral.observer.observers;

import behavioral.observer.subject.Subject;

public class OctalObserver extends BaseObserver{
    public OctalObserver(Subject subject) {
        super(subject);
    }

    @Override
    public void update() {
        System.out.println("Değer değişti, yeni değerin octal değeri:" + Integer.toOctalString(subject.getNumber()));
    }
}
