package org.example.Structural.Adapter;

public class ConnectorAdapter implements InnovativeConnection{

    OldConnection fireHoseConnector;

    public ConnectorAdapter(OldConnection fireHoseConnector) {
        this.fireHoseConnector = fireHoseConnector;
    }

    @Override
    public void connectNew() {
        fireHoseConnector.connectOld();
    }

    @Override
    public void disconnectNew() {
        fireHoseConnector.disconnectOld();
    }
}
