package domein;

public class DomeinController 
{
	private Document document;
	
	private CommandFactory commandFactory;

	public DomeinController()
	{
		document = new Document();
	}
	
	public String readDocument()
	{
		return document.readDocument();
	}

	public void execute(String tekst, String actie) {
		//TODO
	}
}
