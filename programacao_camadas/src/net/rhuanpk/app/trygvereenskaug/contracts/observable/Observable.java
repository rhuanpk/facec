package net.rhuanpk.app.trygvereenskaug.contracts.observable;

import net.rhuanpk.app.trygvereenskaug.contracts.observer.Observer;

public interface Observable {
    void addObserver(Observer observer);

    void removeObserver(Observer observer);

    void notifyObservers();

    void pauseNotifications();

    void resumeNotifications();

    void dispatchNotifications();
}
