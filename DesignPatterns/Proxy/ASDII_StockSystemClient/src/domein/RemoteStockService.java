package domein;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RemoteStockService extends Remote{

	String performActions(String[] args) throws RemoteException;
	
}
