package domein;

public class RemoteControl {

//de afstandsbediening handelt zeven On- en Off-commands
    private Command[] onCommands;
    private Command[] offCommands;

    private final int numberCommands = 7;

    private Command undoCommand;

	public RemoteControl() {
        //we instantieren en initialiseren de on-en off-arrays 
        onCommands = new Command[numberCommands];
        offCommands = new Command[numberCommands];

        Command noCommand = new NoCommand();
        for (int i = 0; i < numberCommands; i++) {
            onCommands[i] = noCommand;
            offCommands[i] = noCommand;
        }
        undoCommand = noCommand;


    }
    /*setCommand krijgt een slotpositie en een On- en een
     Off-command om in dat slot op te slaan. Deze plaatst de opdrachten 
     voor later gebruik in de on- en off-arrays. */

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        onCommands[slot] = onCommand;
        offCommands[slot] = offCommand;
    }

    public void onButtonWasPushed(int slot) {
        onCommands[slot].execute();
        undoCommand=onCommands[slot];
    }

    public void offButtonWasPushed(int slot) {
        offCommands[slot].execute();
        undoCommand=offCommands[slot];
    }

    public void undoButtonWasPushed() {
    	undoCommand.undo();
    	undoCommand = new NoCommand();
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\n-------------Afstandsbediening-------------\n");
        for (int i = 0; i < onCommands.length; i++) {
            stringBuilder.append("[slot " + i + "]" + onCommands[i].getClass().getName()
                    + "   " + offCommands[i].getClass().getName() + "\n");
        }
        return stringBuilder.toString();
    }
}
