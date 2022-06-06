package domein;

import java.util.Iterator;
import java.util.*;

public class File extends AbstractFile {

	private int kbytes;

	public File(String name, int kbytes) {
		setName(name);
		setKBytes(kbytes);
	}

	public void print(int level) {
		String indent = "";
		for (int i = 0; i < level; i++) {
			indent += "\t";
		}
		System.out.println(indent + getName() + " (" + getKBytes() + " kb)");
	}

	public int getKBytes() {
		return kbytes;
	}

	private void setKBytes(int bytes) {
		this.kbytes = bytes;
	}

	@Override
	public Iterator<AbstractFile> createIterator() {
		return new NullIterator();
	}
	
	public boolean isLeaf() {
		return true;
	}
}
