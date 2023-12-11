package org.example.Behavioral.Command.Components;

import org.example.Behavioral.Command.Commands.Command;

public abstract class Component {

    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }

}
