package domein;

import java.util.*;

public class DomeinController 
{
	private Document document;
	
	private CommandFactory commandFactory;

	private Deque<Command> undoStack;

	public DomeinController()
	{
		document = new Document();
		commandFactory = new CommandFactory(document);
		undoStack = new ArrayDeque<>();
	}
	
	public String readDocument()
	{
		return document.readDocument();
	}
	
	//execute niet met hoofdletter
	public void execute(String tekst, String actie) {
		if (actie.equals("undo") && !undoStack.isEmpty()) {
			undoStack.pop().undo();
		}else {
			Command command =  commandFactory.createCommand(actie, tekst)/*.execute()*/;
			undoStack.push(command);
			command.execute();
		}
		
	}
}
