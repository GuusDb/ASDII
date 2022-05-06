package domein;

//VUL DE KLASSE VERDER AAN
public class Vat implements Runnable {

	private final Tafel tafel;
	private int inhoud;

	public Vat(int emmers, Tafel tafel) {
		inhoud = emmers;
		this.tafel = tafel;
	}

	@Override
	public void run() {
		while (inhoud > 0) {
			inhoud--;
			tafel.vulEmmer();
			System.out.println("emmer gevuld");
		}
		tafel.setVatLeeg(true);
	}

//TODO
}
