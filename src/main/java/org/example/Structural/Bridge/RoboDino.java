package org.example.Structural.Bridge;

public class RoboDino implements Toy{

    static int power = 120;

    @Override
    public void turnOn() {
        if (checkPower(2)) {
            System.out.println("RoboDino cold start!");
            power -=2;
        }
        else {
            System.out.println("RoboDino has no power!");
        }
    }

    @Override
    public void turnOff() {
        System.out.println("See you later!");
    }

    @Override
    public void dance() {
        if (checkPower(20)) {
            System.out.println("RoboDino dance!!!");
            power -= 20;
        }
        else {
            System.out.println("RoboDino has no power!");
        }
    }

    @Override
    public void voice() {
        if (checkPower(15)) {
            System.out.println("RoboDino is here!!!");
            power -=15;
        }
        else {
            System.out.println("RoboDino has no power!");
        }
    }

    public Boolean checkPower(int powerNeeded) {
        if (power - powerNeeded <= 0) return false;
        return true;
    }
}
