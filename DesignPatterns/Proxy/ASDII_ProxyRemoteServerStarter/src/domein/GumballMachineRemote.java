package domein;

import java.rmi.Remote;
import java.rmi.RemoteException;

//STAP 1 Remote interface maken
public interface GumballMachineRemote extends Remote
{
	// throws RemoteException
	int getCount() throws RemoteException; 

	String getLocation() throws RemoteException;

	String getState() throws RemoteException;

}
