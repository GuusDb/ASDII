package domein;

public abstract class MenuBuilder {

	private Menu menu;

	public void createMenu() {
		menu = new Menu();
	}

	public Menu getMenu() {
		return this.menu;
	}

	public abstract void buildDrink();

	public abstract void buildMainCourse();

	public abstract void buildSide();
}
