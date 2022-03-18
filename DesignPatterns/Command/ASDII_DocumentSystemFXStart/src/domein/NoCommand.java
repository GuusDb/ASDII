package domein;

public class NoCommand implements Command {

	public void execute() {
		throw new UnsupportedOperationException();
	}

	public NoCommand(Document doc) {
		throw new UnsupportedOperationException();
	}
}
