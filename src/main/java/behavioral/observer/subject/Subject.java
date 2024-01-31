package behavioral.observer.subject;

import behavioral.observer.observers.BaseObserver;
import behavioral.observer.observers.HexaObserver;

import java.util.ArrayList;
import java.util.List;

public class Subject
{
    private List<BaseObserver> observers = new ArrayList<>();

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
        notifyAllSubscribers();
    }

    public void subscribe(BaseObserver observer)
    {
        observers.add(observer);
    }
    public void unsubscribe(BaseObserver observer)
    {
        observers.remove(observer);
    }
    public void notifyAllSubscribers() {
        for (BaseObserver o:
             observers) {
            o.update();
        }
    }
}
