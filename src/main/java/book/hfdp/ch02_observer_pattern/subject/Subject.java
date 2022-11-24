package book.hfdp.ch02_observer_pattern.subject;

import book.hfdp.ch02_observer_pattern.observer.Observer;

public interface Subject {
    public void registerObserver(Observer observer);
    public void removeObserver(Observer observer);
    public void notifyObserver();




}
