package org.example.Structural.Adapter;

public class NHModernConnector implements InnovativeConnection {

    @Override
    public void connectNew() {
        System.out.println("Connecting fire hose using new connection!");
    }

    @Override
    public void disconnectNew() {
        System.out.println("Disconnecting fire hose using new connection!");
    }
}
