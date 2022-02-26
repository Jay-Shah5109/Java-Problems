package com.design.factory;

public class NotificationService {

    public static void main(String[] args) {

        NotificationFactoryObjectCreator notificationFactoryObjectCreator =
                new NotificationFactoryObjectCreator();
        Notification notification =
                notificationFactoryObjectCreator.sendNotification("SMS");
        notification.notifyUser();
    }
}
