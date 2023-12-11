package org.example.Behavioral.Mediator;

public class Button {
    private Mediator mediator;

    public Button(Mediator mediator) {
        this.mediator = mediator;
    }

    public void press() {
        mediator.press();
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
