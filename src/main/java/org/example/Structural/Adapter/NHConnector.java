package org.example.Structural.Adapter;

public class NHConnector implements OldConnection {

    @Override
    public void connectOld() {
        System.out.println("Making some connection using NH connector");
    }

    @Override
    public void disconnectOld() {
        System.out.println("Disconnecting NH connector");
    }
}
