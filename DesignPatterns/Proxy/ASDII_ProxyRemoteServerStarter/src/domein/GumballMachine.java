package domein;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

//Stap 2 : Remote implementatie maken
public class GumballMachine extends UnicastRemoteObject implements GumballMachineRemote
{
	private GumballMachineState currentState;
	private int count = 0;
	private String location;

	public GumballMachine(String location, int numberGumballs) throws RemoteException
	{
		this.location = location;
		this.count = numberGumballs;
		toState((numberGumballs > 0) ? new NoQuarterState(this) : new OutOfGumballsState(this));
	}

	public String insertQuarter() {
		return currentState.insertQuarter();
	}

	public String ejectQuarter() {
		return currentState.ejectQuarter();
	}

	public String turnCrank() {
		String msg1 = currentState.turnCrank();
		String msg2 = currentState.dispense();
		return String.format("%s\n%s", msg1, msg2);
	}

	protected String releaseBall() {
		if (count != 0) {
			count = count - 1;
		}
		return "A gumball comes rolling out the slot...";
	}

	public void refill(int count) {
		this.count = count;
		toState(new NoQuarterState(this));
	}

	protected void toState(GumballMachineState newState) {
		currentState = newState;
	}

	@Override
	public String toString() {
		StringBuilder result = new StringBuilder();
		result.append("\nMighty Gumball, Inc.");
		result.append("\nJava-enabled Standing Gumball Model");
		result.append("\nInventory: ").append(count).append(" gumball");
		if (count != 1) {
			result.append("s");
		}
		result.append("\n");
		result.append("Machine is ").append(currentState).append("\n");
		return result.toString();
	}

	public String getLocation() {
		return location;
	}

	public String getState() {
		return currentState.getClass().getSimpleName();
	}

	public int getCount() {
		return count;
	}
}
