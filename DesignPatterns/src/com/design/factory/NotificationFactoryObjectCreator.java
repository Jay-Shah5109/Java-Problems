package com.design.factory;

// This class handles the creation of object
public class NotificationFactoryObjectCreator {

    public Notification sendNotification(String channel) {

        if(channel == null || channel.isEmpty()) {
            return null;
        }
        else if (channel.equals("SMS")) {
            return new SMS();
        }
        else if (channel.equals("EMAIL")) {
            return new EmailNotification();
        }
        else if (channel.equals("PUSH NOTIFICATION")) {
            return new PushNotification();
        }
        else
            return null;

    }
}
