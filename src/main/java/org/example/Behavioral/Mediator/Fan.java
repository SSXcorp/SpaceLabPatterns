package org.example.Behavioral.Mediator;

public class Fan {
    private Mediator mediator;

    public Fan(Mediator mediator) {
        this.mediator = mediator;
    }

    private boolean isOn = false;

    public void turnOn() {
        mediator.start();
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
        mediator.stop();
    }

    public boolean isOn() {
        return isOn;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
