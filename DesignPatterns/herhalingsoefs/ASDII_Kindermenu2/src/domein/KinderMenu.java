package domein;

public class KinderMenu {
	private String hamburger;
	private String drank;
	private String dessert;
	private String geschenk;

	public void setHamburger(String hamburger) {
		this.hamburger = hamburger;
	}

	public void setDrank(String drank) {
		this.drank = drank;
	}

	public void setDessert(String dessert) {
		this.dessert = dessert;
	}

	public void setGeschenk(String geschenk) {
		this.geschenk = geschenk;
	}

	public String getHamburger() {
		return hamburger;
	}

	public String getDrank() {
		return drank;
	}

	public String getDessert() {
		return dessert;
	}

	public String getGeschenk() {
		return geschenk;
	}

	@Override
	public String toString() {
		return String.format("KinderMenu: hamburger=%s, drank=%s, dessert=%s, geschenk=%s%n", hamburger, drank, dessert,
				geschenk);
	}

}