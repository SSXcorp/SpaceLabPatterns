package org.example.Structural.Adapter;

public class Main {
    public static void main(String[] args) {
        NHConnector NHOld = new NHConnector();
        InnovativeConnection innovativeConnection = new NHModernConnector();

        InnovativeConnection connectionAdapter = new ConnectorAdapter(NHOld);

        System.out.println("Connecting and disconnecting fire hose OLD way...");
        NHOld.connectOld();
        NHOld.disconnectOld();
        System.out.println("__________________________________________________");

        System.out.println("Connecting and disconnecting fire hose NEW way...");
        innovativeConnection.connectNew();
        innovativeConnection.disconnectNew();
        System.out.println("__________________________________________________");

        System.out.println("Connecting and disconnecting fire hose NEW way USING ADAPTER...");
        connectionAdapter.connectNew();
        connectionAdapter.disconnectNew();
        System.out.println("__________________________________________________");

    }
}
