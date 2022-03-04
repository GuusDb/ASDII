package domein;

import java.util.*;

public class PanCakeHouseMenuIterator implements Iterator {

	private ArrayList<MenuItem> items;
	private int position = 0;

	public boolean hasNext() {
		return position < items.size();
	}

	public java.lang.Object next() {
		return items.get(position++);
	}

	public PanCakeHouseMenuIterator(ArrayList<domein.MenuItem> list) {
		items = list;
	}
}
