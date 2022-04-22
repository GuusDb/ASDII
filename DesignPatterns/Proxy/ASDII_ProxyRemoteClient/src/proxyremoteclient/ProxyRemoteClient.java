package proxyremoteclient;

import domein.GumballMachineRemote;
import domein.GumballMonitor;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ProxyRemoteClient {

    private void doTest() {
        try {
            // get remote registry object on port 1099 (rmi nameservice)
            Registry myRegistry = LocateRegistry.getRegistry("localhost", 1099);
            // dit is de default ==> LocateRegistry.getRegistry();

            // search for remote object GumballMachineRemote (via rmi nameservice)
            GumballMachineRemote machine = (GumballMachineRemote) myRegistry.lookup("gumballmachine");

            // Geef remote object door aan GumballMonitor	
            GumballMonitor monitor = new GumballMonitor(machine);

            monitor.report();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ProxyRemoteClient main = new ProxyRemoteClient();
        main.doTest();
    }
}
