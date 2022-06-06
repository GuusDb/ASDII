package domein;

public class KinderMenu {
	private final String hamburger;
	private final String drank;
	private final String dessert;
	private final String geschenk;

	private KinderMenu(Builder builder) {
		hamburger = builder.hamburger;
		drank = builder.drank;
		dessert = builder.dessert;
		geschenk = builder.geschenk;
	}

	public static class Builder {

		private String hamburger;
		private String drank;
		private String dessert;
		private String geschenk;

		public Builder hamburger(String hamburger) {
			this.hamburger = hamburger;
			return this;
		}

		public Builder drank(String drank) {
			this.drank = drank;
			return this;
		}

		public Builder dessert(String dessert) {
			this.dessert = dessert;
			return this;
		}

		public Builder geschenk(String geschenk) {
			this.geschenk = geschenk;
			return this;
		}

		public KinderMenu build() {
			if (isEmpty(hamburger) || isEmpty(drank) || isEmpty(dessert) || isEmpty(geschenk))
				throw new IllegalArgumentException();
			return new KinderMenu(this);
		}

		private boolean isEmpty(String field) {
			return field == null || field.isBlank();
		}
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