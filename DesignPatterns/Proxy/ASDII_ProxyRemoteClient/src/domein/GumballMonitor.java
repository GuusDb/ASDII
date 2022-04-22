package domein;

import java.rmi.RemoteException;

public class GumballMonitor {

    private GumballMachineRemote machine;

    public GumballMonitor(GumballMachineRemote machine) {
        this.machine = machine;
    }

    public void report() {
        try {
            System.out.println("Gumball machine: " + machine.getLocation());
            System.out.println("Current inventory: " + machine.getCount());
            System.out.println("Current state: " + machine.getState());
        } catch (RemoteException ex) {
            ex.printStackTrace();
        }

    }
}
