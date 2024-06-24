package org.example.observerPattern.Observable;

import org.example.observerPattern.Observer.NotificationALertObserver;

public interface StockObservable {
    public void add(NotificationALertObserver notificationALertObserver);
    public void remove(NotificationALertObserver notificationALertObserver);
    public void notifySubscriber();
    public void setStockCount(int newStockCount);

}
