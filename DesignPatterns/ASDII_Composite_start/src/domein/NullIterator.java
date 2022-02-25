package domein;

import java.util.Iterator;

public class NullIterator implements Iterator<MenuComponent> {
	@Override
	public MenuComponent next() {
		return null;
	}

	@Override
	public boolean hasNext() {
		return false;
	}
}
