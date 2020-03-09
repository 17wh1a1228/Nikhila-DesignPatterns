package com.maven.epam;

import java.util.ArrayList;
import java.util.List;

interface Internet {
    void connectTo(String serverHost);
}

class RealInternet implements Internet {
    public void connectTo(String serverHost) {
        System.out.println("Connected : "+ serverHost);
    }
}

class ProxyInternet implements Internet {
    private Internet internet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<String>();
        bannedSites.add("abc.com");
        bannedSites.add("def.com");
        bannedSites.add("ghi.com");
        bannedSites.add("jkl.com");
        bannedSites.add("nmo.com");
    }

    public void connectTo(String serverHost){
        if(bannedSites.contains(serverHost.toLowerCase())) {
            System.out.println("Access Denied : " + serverHost);
        }else {
            internet.connectTo(serverHost);
        }
    }
}

public class InternetProxy {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        internet.connectTo("github.com");
        internet.connectTo("abc.com");
    }
}