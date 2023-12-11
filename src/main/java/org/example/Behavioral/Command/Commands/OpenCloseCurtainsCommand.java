package org.example.Behavioral.Command.Commands;

import org.example.Behavioral.Command.Components.Curtains;

public record OpenCloseCurtainsCommand(Curtains curtains) implements Command {
    @Override
    public void execute() {
        curtains.openClose();
    }

}
