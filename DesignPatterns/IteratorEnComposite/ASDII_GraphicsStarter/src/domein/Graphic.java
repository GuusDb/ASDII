package domein;

public abstract class Graphic {

	public abstract void draw();

	public void add(Graphic item) {
		throw new UnsupportedOperationException();
	}

	public void remove(Graphic item) {
		throw new UnsupportedOperationException();
	}

	public Graphic get(int index) {
		throw new UnsupportedOperationException();
	}
}
