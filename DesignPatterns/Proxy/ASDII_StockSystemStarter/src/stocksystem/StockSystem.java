package stocksystem;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import domein.RemoteStockService;
import domein.StockServiceController;

public class StockSystem {


    public static void main(String[] args) {
        new StockSystem().run();
    }

    private void run() {
    	registerStockService();
    }

    private void registerStockService() {
    	try {
			Registry registry = LocateRegistry.createRegistry(1099);
			RemoteStockService service = new StockServiceController();
			registry.rebind("stockservice", service);
			System.out.println("RemoteStockService is running...");
		} catch (RemoteException e) {
			e.printStackTrace();
		}
    }
}