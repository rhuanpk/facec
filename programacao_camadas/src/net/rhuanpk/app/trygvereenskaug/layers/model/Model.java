package net.rhuanpk.app.trygvereenskaug.layers.model;

import net.rhuanpk.app.trygvereenskaug.contracts.observable.Observable;
import net.rhuanpk.app.trygvereenskaug.contracts.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Model implements Observable {
    private final List<Observer> observers = new ArrayList<>();
    private Boolean notificationPaused = false;
    private Boolean pendingNotifications = false;

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.render();
        }
    }

    @Override
    public void pauseNotifications() {
        notificationPaused = true;
    }

    @Override
    public void resumeNotifications() {
        notificationPaused = false;
        if (pendingNotifications) {
            pendingNotifications = false;
            notifyObservers();
        }
    }

    @Override
    public void dispatchNotifications() {
        if (notificationPaused) {
            pendingNotifications = true;
            return;
        }
        notifyObservers();
    }
}
