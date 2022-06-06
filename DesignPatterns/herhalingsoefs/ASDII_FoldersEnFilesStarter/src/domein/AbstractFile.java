package domein;

import java.util.Iterator;import java.util.*;

public abstract class AbstractFile {

	private java.lang.String name;

	public java.lang.String getName() {
		return this.name;
	}

	public void setName(java.lang.String value) {
		this.name = value;
	}

	public void add(AbstractFile obj) {
		throw new UnsupportedOperationException();
	}

	public abstract void print(int level);

	public int getKBytes() {
		throw new UnsupportedOperationException();
	}

	public abstract Iterator<domein.AbstractFile> createIterator();
	
	public boolean isLeaf() {
		return false;
	}
}
