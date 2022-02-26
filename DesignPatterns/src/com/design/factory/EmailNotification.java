package com.design.factory;

public class EmailNotification implements Notification {
    public void notifyUser() {
        System.out.println("Notifying user via email notification");
    }
}
