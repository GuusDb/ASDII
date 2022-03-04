package domein;
//Builder zou dit moeten noemen JapaneseMenuBuilder
public class JapaneseMenuBuilder extends MenuBuilder {
	
	public void buildDrink() {
		getMenu().setDrink("Sake");
	}

	public void buildMainCourse() {
		getMenu().setMainCourse("Ramen");
	}

	public void buildSide() {
		getMenu().setSide("Gyoza");
	}
}
