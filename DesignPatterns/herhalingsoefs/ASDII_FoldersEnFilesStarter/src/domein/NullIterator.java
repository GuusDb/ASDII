package domein;

import java.util.Iterator;

public class NullIterator implements Iterator<AbstractFile>{

	@Override
	public boolean hasNext() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public AbstractFile next() {
		// TODO Auto-generated method stub
		return null;
	}
}
