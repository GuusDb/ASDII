package domein;

import java.util.*;

public class Screen {
	
	private Collection<Component> components = new ArrayList<>();
	private GuiFactory guiFactory;

	public Screen(GuiFactory guiFactory) {
		this.guiFactory = guiFactory;
	}
	
    public void addButton() {
        //TODO
    	components.add(guiFactory.createButton());
    }

    public void addLabel() {
        //TODO
    	components.add(guiFactory.createLabel());
    }

    public void viewComponents() {
        components.forEach(Component::show);
    }




}
