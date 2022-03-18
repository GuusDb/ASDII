package domein;

public class DomeinController 
{
	private Document document;
	
	private CommandFactory commandFactory;

	public DomeinController()
	{
		document = new Document();
		commandFactory = new CommandFactory(document);
	}
	
	public String readDocument()
	{
		return document.readDocument();
	}
	
	//execute niet met hoofdletter
	public void execute(String tekst, String actie) {
		commandFactory.createCommand(actie, tekst).Execute();
	}
}
