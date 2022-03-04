package domein;

public class MenuDirector {

	private MenuBuilder menuBuilder;

	public MenuDirector(MenuBuilder builder) {
		menuBuilder = builder;
	}

	public void buildMenu() {
		menuBuilder.createMenu();
		menuBuilder.buildDrink();
		menuBuilder.buildMainCourse();
		menuBuilder.buildSide();
	}

	public Menu getMenu() {
		return menuBuilder.getMenu();
	}
}
