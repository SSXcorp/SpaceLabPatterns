package org.example.Behavioral.Command.Commands;

import org.example.Behavioral.Command.Components.Light;

public record SwitchLightsCommand(Light light) implements Command {
    @Override
    public void execute() {
        light.switchLights();
    }
}
