package domein;

public class NoCommand implements Command {

    @Override
    public void execute() {
    }

	public void undo() {
		throw new UnsupportedOperationException();
	}

}
