package domein;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.rmi.server.*;

public class StockServiceController extends UnicastRemoteObject implements RemoteStockService{

    private IStockService service;

    private CommandFactory commandFactory;
    
    private UserRepository userRepo;

	public StockServiceController() throws RemoteException{
		userRepo = new UserRepository();
    	service = new StockService();
    	commandFactory = new CommandFactory(service);
    }

	public String performActions(String[] args) {
		try {
			User user = userRepo.getUser(args[0]);
			if(user == null) {
				return "unkown user";
			}
			return commandFactory.createCommand(user.getIsAdmin(),args).execute();
		}catch(AccessDeniedException ex) {
			return "Access denied for this operation";
		}
    }
}
