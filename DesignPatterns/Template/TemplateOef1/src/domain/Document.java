package domain;
public abstract class Document {

	public final void print() {
		header();
		body();
		footer();
	}

	protected abstract void header();

	protected abstract void body();

	protected abstract void footer();
}
