package com.design.factory;

public class SMS implements Notification {

    public void notifyUser () {
        System.out.println("sending user notification via SMS");
    }
}
