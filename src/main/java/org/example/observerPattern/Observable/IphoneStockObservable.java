package org.example.observerPattern.Observable;

import org.example.observerPattern.Observer.NotificationALertObserver;

import java.util.List;

public class IphoneStockObservable implements StockObservable{

    List<NotificationALertObserver> notificationALertObserversList;
    int stockCount=0;

    @Override
    public void add(NotificationALertObserver notificationALertObserver) {
        notificationALertObserversList.add(notificationALertObserver);
    }

    @Override
    public void remove(NotificationALertObserver notificationALertObserver) {
        notificationALertObserversList.remove(notificationALertObserver);
    }

    @Override
    public void notifySubscriber() {
        for (NotificationALertObserver notificationALertObserver:notificationALertObserversList){
            notificationALertObserver.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {
        if (stockCount==0){
            notifySubscriber();
        }
        stockCount=stockCount+newStockCount;
    }
}
