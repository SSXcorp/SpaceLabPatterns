package org.example.Behavioral.Iterator;

import java.util.ArrayList;
import java.util.List;

public class NotificationCollectionImpl implements NotificationCollection {

    private List<Notification> notificationsList;

    public NotificationCollectionImpl() {
        notificationsList = new ArrayList<>();
    }

    public void addNotification(Notification c) {
        this.notificationsList.add(c);
    }

    public void removeNotification(Notification c) {
        this.notificationsList.remove(c);
    }

    @Override
    public NotificationIterator iterator(NotificationType type) {
        return new NotificationIteratorImpl(type, this.notificationsList);
    }

    private class NotificationIteratorImpl implements NotificationIterator {

        private NotificationType type;
        private List<Notification> notifications;
        private int position;

        public NotificationIteratorImpl(NotificationType ty, List<Notification> channelsList) {
            this.type = ty;
            this.notifications = channelsList;
        }

        @Override
        public boolean hasNext() {
            while (position < notifications.size()) {
                Notification c = notifications.get(position);
                if (c.getTYPE().equals(type) || type.equals(NotificationType.ALL)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Notification next() {
            Notification c = notifications.get(position);
            position++;
            return c;
        }

    }
}
