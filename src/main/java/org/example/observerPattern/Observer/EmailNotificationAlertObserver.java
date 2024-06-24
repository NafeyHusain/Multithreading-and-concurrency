package org.example.observerPattern.Observer;

import org.example.observerPattern.Observable.StockObservable;

public class EmailNotificationAlertObserver implements NotificationALertObserver{

    StockObservable stockObservable;
    String emailId;

    public EmailNotificationAlertObserver(StockObservable stockObservable, String emailId) {
        this.stockObservable = stockObservable;
        this.emailId = emailId;
    }

    @Override
    public void update() {
        sendEmail(emailId);
    }

    private void sendEmail(String emailId){
        System.out.println("Email send succesfully to user : "+emailId);
    }
}
