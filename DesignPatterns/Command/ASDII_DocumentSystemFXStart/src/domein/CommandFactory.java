package domein;

public class CommandFactory {
	
	private Document document;

	public Command createCommand(String actie, String tekst) {
		return switch(actie.toLowerCase()){
			case "concat" -> new ConcatCommand(document, tekst);
			case "delete" -> new DeleteCommand(document, tekst);
			default -> new NoCommand(document); 
		};
	}

	public CommandFactory(Document doc) {
		document = doc;
	}
}
