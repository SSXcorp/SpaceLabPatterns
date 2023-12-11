package org.example.Behavioral.Iterator;

public class Main {
    public static void main(String[] args) {
        NotificationCollection channels = populateChannels();
        NotificationIterator baseIterator = channels.iterator(NotificationType.ALL);
        while (baseIterator.hasNext()) {
            Notification c = baseIterator.next();
            System.out.println(c.toString());
        }
        System.out.println("******");
        // Local type iterator
        NotificationIterator localIterator = channels.iterator(NotificationType.LOCAL);
        while (localIterator.hasNext()) {
            Notification c = localIterator.next();
            System.out.println(c.toString());
        }
    }

    private static NotificationCollection populateChannels() {
        NotificationCollection channels = new NotificationCollectionImpl();
        channels.addNotification(new Notification(1, NotificationType.LOCAL));
        channels.addNotification(new Notification(2, NotificationType.PUSH));
        channels.addNotification(new Notification(2, NotificationType.SILENT_PUSH));
        channels.addNotification(new Notification(2, NotificationType.LOCAL));
        channels.addNotification(new Notification(1, NotificationType.PUSH));
        channels.addNotification(new Notification(1, NotificationType.SILENT_PUSH));
        channels.addNotification(new Notification(1, NotificationType.LOCAL));
        channels.addNotification(new Notification(1, NotificationType.PUSH));
        channels.addNotification(new Notification(5, NotificationType.SILENT_PUSH));
        return channels;
    }
}
