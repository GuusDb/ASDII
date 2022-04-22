package ui;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import domein.RemoteStockService;

public class StockSystem {

	//private StockServiceController controller = new StockServiceController();
	private RemoteStockService stockService;
    private Scanner choose = new Scanner(System.in);

    public static void main(String[] args) {
        new StockSystem().run();
    }
    
    private RemoteStockService getRemoteService() {
		try {
			Registry registry = LocateRegistry.getRegistry("localhost", 1099);
			return (RemoteStockService) registry.lookup("stockservice");
		} catch (RemoteException e) {
			e.printStackTrace();
		} catch (NotBoundException e) {
			e.printStackTrace();
		}
		return null;
	}

    private void run() {
    	stockService = getRemoteService();
    	System.out.println("RemoteClient is running...");
        String action = askAction();
        String mes;
        while (!action.equalsIgnoreCase("end")) {
            try {
				mes = stockService.performActions(action.split(" "));
				System.out.print(mes);
		        action = askAction();
			} catch (RemoteException e) {
				e.printStackTrace();
			}
        }
        choose.close();
    }



	private String askAction() {
        System.out.println("");
        System.out.println("-------------Usage: LoggingDemo ActionName Arguments. Enter end to quit------------");
        System.out.println("Actions:");
        System.out.println("   createProduct productname quantity");
        System.out.println("   updateQuantity productname quantity");
        System.out.println("   shipProduct productname");
        System.out.println("   showStock");       
        System.out.println("Enter action :");
        return choose.nextLine();
    }
}