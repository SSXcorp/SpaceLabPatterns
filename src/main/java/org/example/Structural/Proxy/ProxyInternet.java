package org.example.Structural.Proxy;

import java.util.ArrayList;
import java.util.List;


public class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("youtube.com");
        bannedSites.add("deep_space.com");
        bannedSites.add("dota2.com");
        bannedSites.add("stackOverflow.com");
    }

    @Override
    public void connectTo(String serverhost) throws Exception {
        if(bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("Access Denied");
        }
        internet.connectTo(serverhost);
    }
}
