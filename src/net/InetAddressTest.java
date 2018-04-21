package net;

import java.io.IOException;
import java.net.InetAddress;

public class InetAddressTest {
    public static void main(String[] args) throws Exception {
        //Demonstrate the InetAddress
        InetAddress ip = InetAddress.getByName("www.crazyit.org");
        System.out.println("Is crazyit reachable:" + ip.isReachable(2000));
        System.out.println(ip.getHostAddress());
        System.out.println("Is local reachable:" + InetAddress.getLocalHost());
    }
}
