package org.example.Structural.Proxy;

public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("localhost");
            internet.connectTo("youtube.com");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
