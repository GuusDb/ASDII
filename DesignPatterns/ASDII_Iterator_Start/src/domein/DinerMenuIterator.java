package domein;

public class DinerMenuIterator implements Iterator {

    private MenuItem[] list;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] list) {
        this.list = list;
    }

    public Object next() {
        MenuItem menuItem = list[position];
        position = position + 1;
        return menuItem;
    }

    public boolean hasNext() {
        return (position < list.length && list[position] != null);
    }

	public void remove() {
		throw new UnsupportedOperationException();
	}

}
