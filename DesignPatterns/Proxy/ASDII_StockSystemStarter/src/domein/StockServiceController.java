package domein;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class StockServiceController extends UnicastRemoteObject implements RemoteStockService{

    private StockService service;

    private CommandFactory commandFactory;
    
    public StockServiceController() throws RemoteException{
    	service = new StockService();
    	commandFactory = new CommandFactory(service);
    }

	public String performActions(String[] args) {
		return commandFactory.createCommand(args).execute();
    }
}
