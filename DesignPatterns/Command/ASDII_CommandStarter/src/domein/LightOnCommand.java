package domein;

public class LightOnCommand implements Command {

    private Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
    //Execute schakelt verlichting aan, dus undo() schakelt de verlichting uit
    
 
}
