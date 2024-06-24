package org.example.observerPattern.Observer;

import org.example.observerPattern.Observable.StockObservable;

public class MobileNotificationAlertObserver implements NotificationALertObserver{
    StockObservable stockObservable;
    String mobileNumber;

    public MobileNotificationAlertObserver(StockObservable stockObservable, String mobileNumber) {
        this.stockObservable = stockObservable;
        this.mobileNumber = mobileNumber;
    }

    @Override
    public void update() {
        System.out.println("Send mobile notification " + mobileNumber);
    }
}
