package domein;

public abstract class KinderMenuBuider {

	private KinderMenu kinderMenu;

	public KinderMenu getKinderMenu() {
		return kinderMenu;
	}

	public void createNewKinderMenu() {
		kinderMenu = new KinderMenu();
	}

	public void buildHamburger(String hamburger) {
		kinderMenu.setHamburger(hamburger);
	}

	public void buildDrank(String drank) {
		kinderMenu.setDrank(drank);
	}

	public void buildDessert(String dessert) {
		kinderMenu.setDessert(dessert);
	}

	public void buildGeschenk(String geschenk) {
		kinderMenu.setGeschenk(geschenk);
	}

}
