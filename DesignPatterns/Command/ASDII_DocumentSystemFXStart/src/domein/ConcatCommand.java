package domein;

public class ConcatCommand implements Command {

	private Document document;
	private String tekst;

	public void execute() {
		document.concat(tekst);
	}

	public ConcatCommand(Document doc, String tekst) {
		document = doc;
		this.tekst = tekst;
	}

	@Override
	public void undo() {
		document.removeAtEnd(tekst);
		
	}
}
