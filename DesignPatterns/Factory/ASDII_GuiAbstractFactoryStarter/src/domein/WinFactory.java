package domein;

public class WinFactory implements GuiFactory {

	public Component createButton() {
		return new WinButton();
	}

	public Component createLabel() {
		return new WinLabel();
	}
}
