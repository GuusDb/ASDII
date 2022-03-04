package domein;

public class MacFactory implements GuiFactory {

	public Component createButton() {
		return new MacButton();
	}

	public Component createLabel() {
		return new MacLabel();
	}
}
