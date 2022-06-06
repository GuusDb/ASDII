package domein;

import java.util.*;

public class Directory extends AbstractFile {
	private List<AbstractFile> files;
	
	public Directory(String name) {
		setName(name);
		files = new ArrayList<>();
	}

	public void add(AbstractFile obj) {
		files.add(obj);
	}

	public void print(int level) {
		String indent = "";
		for (int i = 0; i < level; i++)
			indent += "\t";
		System.out.println(indent + "Directory : " + getName());
		level++;
		for(AbstractFile afile:files) {
			afile.print(level);
		}
//		for (Object obj : files) {
//			if (obj instanceof Directory directory)
//				directory.print(level);
//			else
//				((File) obj).print(level);
//		}
	}

	@Override
	public Iterator<AbstractFile> createIterator() {
		return files.iterator();

	}

}
