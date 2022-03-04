package domein;

import java.util.Iterator;
import java.util.*;

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
