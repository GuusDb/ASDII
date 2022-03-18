package domein;

public class DeleteCommand implements Command {

	private Document document;
	private String tekst;
	private int eersteVoorkomen;

	public void execute() {
		eersteVoorkomen = document.getFirstIndexOf(tekst);
		document.erase(tekst);
	}

	public DeleteCommand(Document doc, String tekst) {
		document = doc;
		this.tekst = tekst;
	}

	@Override
	public void undo() {
		document.insert(tekst, eersteVoorkomen);
	}
}
