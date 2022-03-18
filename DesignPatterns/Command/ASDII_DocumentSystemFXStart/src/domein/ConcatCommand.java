package domein;

public class ConcatCommand implements Command {

	private Document document;
	private String tekst;

	public void Execute() {
		document.concat(tekst);
	}

	public ConcatCommand(Document doc, String tekst) {
		document = doc;
		this.tekst = tekst;
	}
}
