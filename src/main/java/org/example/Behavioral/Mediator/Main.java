package org.example.Behavioral.Mediator;

public class Main {
    public static void main(String[] args) {
        PowerSupplier powerSupplier = new PowerSupplier();
        Fan fan = new Fan(null);
        Button button = new Button(null);

        Mediator mediator = new Mediator(button, fan, powerSupplier);
        button.setMediator(mediator);
        fan.setMediator(mediator);

        System.out.println("Fan is on: "+ fan.isOn());
        System.out.println("Pressing the button:");
        button.press();
        System.out.println("Fan is on: "+ fan.isOn());
        System.out.println("------------------------------------------------------");

        System.out.println("Pressing the button again:");
        button.press();
        System.out.println("Fan is on: "+ fan.isOn());
        System.out.println("------------------------------------------------------");

        System.out.println("Turning off the fan:");
        fan.turnOff();
        System.out.println("Fan is on: "+ fan.isOn());
        System.out.println("------------------------------------------------------");

        System.out.println("Turning on the fan:");
        fan.turnOn();
        System.out.println("Fan is on: "+ fan.isOn());
        System.out.println("------------------------------------------------------");
    }
}
