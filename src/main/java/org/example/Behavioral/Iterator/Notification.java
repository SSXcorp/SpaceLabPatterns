package org.example.Behavioral.Iterator;

public class Notification {

    private int priority;
    private NotificationType TYPE;

    public Notification(int priority, NotificationType type){
        this.priority=priority;
        this.TYPE=type;
    }

    public int getPriority() {
        return priority;
    }

    public NotificationType getTYPE() {
        return TYPE;
    }

    @Override
    public String toString(){
        return "Notification priority="+this.priority+", Type="+this.TYPE;
    }

}