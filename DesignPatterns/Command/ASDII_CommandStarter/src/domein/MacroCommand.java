package domein;

import java.util.Arrays;
import java.util.LinkedList;

public class MacroCommand implements Command {
    private Command[] commands;
    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }
    @Override
    public void execute() {
        Arrays.stream(commands).forEach(Command::execute);
    }
    /* NOTE:  these commands have to be done backwards to 
     ensure proper undo functionality */
	@Override
	public void undo() {
		// TODO Auto-generated method stub
//		List<Command> li = new ArrayList<>(Arrays.asList(commands));
//		Collections.reverse(li);//NEVENEFFECT
//		li.forEach(Command::undo);
		new LinkedList<>(Arrays.asList(commands)).descendingIterator().forEachRemaining(Command::undo);
	}


}
