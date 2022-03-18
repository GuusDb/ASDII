package domein;

public class DeleteCommand implements Command {

	private Document document;
	private String tekst;

	public void Execute() {
		document.erase(tekst);
	}

	public DeleteCommand(Document doc, String tekst) {
		document = doc;
		this.tekst = tekst;
	}
}
