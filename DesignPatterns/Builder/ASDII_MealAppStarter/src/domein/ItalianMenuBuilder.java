package domein;
//Builder zou dit moeten noemen ItalianMenuBuilder
public class ItalianMenuBuilder extends MenuBuilder {

	public void buildDrink() {
		getMenu().setDrink("Red Wine");
	}

	public void buildMainCourse() {
		getMenu().setMainCourse("Pizza Margaritha");
	}

	public void buildSide() {
		getMenu().setSide("Bread");
	}
}
