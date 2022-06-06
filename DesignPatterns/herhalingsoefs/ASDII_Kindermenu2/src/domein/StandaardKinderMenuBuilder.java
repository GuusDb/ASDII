package domein;

public class StandaardKinderMenuBuilder extends KinderMenuBuider{

	public KinderMenu getKinderMenu() {
		KinderMenu kinderMenu = super.getKinderMenu();
		if (isEmpty(kinderMenu.getHamburger()) || 
				isEmpty(kinderMenu.getDrank()) || 
				isEmpty(kinderMenu.getDessert()) || 
				isEmpty(kinderMenu.getGeschenk()))
			throw new IllegalArgumentException();
		return kinderMenu;
	}

	private boolean isEmpty(String field) {
		return field == null || field.isBlank();
	}

}
