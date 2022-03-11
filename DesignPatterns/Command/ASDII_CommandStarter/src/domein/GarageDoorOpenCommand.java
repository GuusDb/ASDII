package domein;

public class GarageDoorOpenCommand implements Command{
	
	private GarageDoor garageDoor;
	
	public GarageDoorOpenCommand(GarageDoor garageDoor) {
		this.garageDoor = garageDoor;
	}

	@Override
	public void execute() {
		garageDoor.up();
		garageDoor.lightOn();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		garageDoor.lightOff();
		garageDoor.down();
	}
	
}