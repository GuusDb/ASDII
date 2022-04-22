package proxyremoteserver;

import domein.GumballMachine;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.concurrent.ThreadLocalRandom;

public class ProxyRemoteServer {

	private final String location;
	private final int count;
	private GumballMachine machine;

	public static void main(String[] args) {
		if (args.length < 2) {
			System.out.println("Gumball machine <name> <inventory>");
			System.exit(1);
		}
		int count = Integer.parseInt(args[1]);
		new ProxyRemoteServer(args[0], count).run();
	}

	public ProxyRemoteServer(String location, int count) {
		this.location = location;
		this.count = count;
		registerRemoteGumballMachine();
//		machine = new GumballMachine(location, count);
//		GumballMonitor monitor = new GumballMonitor(machine);
//		monitor.report();
	}

	private void registerRemoteGumballMachine() {

		try {
			// Stap 4 : RMI registry starten (= name service voor remote objecten)
			// create remoteobject nameservice on port 1099
			Registry registry = LocateRegistry.createRegistry(1099);

			// Stap 5 : Het remote object bekend maken bij de name service
			machine = new GumballMachine(location, count);
			registry.rebind("gumballmachine", machine);

		} catch (RemoteException ex) {
			ex.printStackTrace();
		}

	}

	private void run() {
        System.out.println("GumballMachine Operational.");
        System.out.println(machine);
        while (machine.getCount() > 0) {
            try {
                Thread.sleep(ThreadLocalRandom.current().nextInt(9000) + 1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            getAGumball();
            System.out.println(machine);
        }
    }

    private void getAGumball() {
        System.out.println(machine.insertQuarter());
        try {
            Thread.sleep(ThreadLocalRandom.current().nextInt(2000) + 500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        System.out.println(machine.turnCrank());
    }

}
