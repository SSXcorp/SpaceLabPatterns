package org.example.Structural.Bridge;

public interface Toy {

    public int power = 0;

    public void turnOn();

    public void turnOff();

    public void dance();

    public void voice();

    public Boolean checkPower(int powerNeeded);

}
