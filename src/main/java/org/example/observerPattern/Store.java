package org.example.observerPattern;

import org.example.observerPattern.Observable.IphoneStockObservable;
import org.example.observerPattern.Observable.StockObservable;
import org.example.observerPattern.Observer.EmailNotificationAlertObserver;
import org.example.observerPattern.Observer.NotificationALertObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable iphone=new IphoneStockObservable();
        NotificationALertObserver emailNotify=new EmailNotificationAlertObserver(iphone,"");


        iphone.add(emailNotify);

        iphone.setStockCount(10);
    }
}
