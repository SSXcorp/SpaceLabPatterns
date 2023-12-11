package org.example.Behavioral.Iterator;

public interface NotificationCollection {

    public void addNotification(Notification c);

    public void removeNotification(Notification c);

    public NotificationIterator iterator(NotificationType type);

}