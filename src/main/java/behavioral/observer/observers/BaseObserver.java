package behavioral.observer.observers;

import behavioral.observer.subject.Subject;

public abstract class BaseObserver
{
    protected Subject subject;

    public BaseObserver(Subject subject) {
        this.subject = subject;
        this.subject.subscribe(this);
    }

    public abstract void update();
}
