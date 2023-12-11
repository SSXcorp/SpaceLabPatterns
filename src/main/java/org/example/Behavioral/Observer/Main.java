package org.example.Behavioral.Observer;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Create a subject
        Subject demoSubject = new SubjectDemo();
        List<Observer> observers = new ArrayList<>();
        //Create observers
        for (int i = 1; i <= 5; i++) {
            observers.add(new ObserverDemo("Observer-" + i));
        }

        //Register observers to Subject (demoSubject)
        for (Observer observer : observers) {
            demoSubject.register(observer);
            observer.setSubject(demoSubject);
        }
        //check for an update
        observers.get(0).update();
        //post a message on topic and get all the observers notified.
        demoSubject.postMessage("New message for all observers!");
    }
}
