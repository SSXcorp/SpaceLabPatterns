package org.example.Behavioral.Command.Components;

import org.example.Behavioral.Command.Commands.OpenCloseCurtainsCommand;
import org.example.Behavioral.Command.Commands.SwitchLightsCommand;

public class Main {
    public static void main(String[] args) {
        Room room = new Room();
        room.setCommand(new OpenCloseCurtainsCommand(room.getCurtains()));
        room.executeCommand();
        System.out.println(room.curtainsOpen());

        System.out.println("==========================================");

        FloorLamp lamp = new FloorLamp();
        lamp.setCommand(new SwitchLightsCommand(lamp.getLight()));
        lamp.executeCommand();
        System.out.println(lamp.isLightOn());
    }
}
