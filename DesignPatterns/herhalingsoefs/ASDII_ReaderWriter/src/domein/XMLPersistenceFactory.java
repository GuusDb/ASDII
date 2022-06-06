package domein;

public class XMLPersistenceFactory implements PersistenceFactory {

	public Reader createReader() {
		return new XMLReader();
	}

	public Writer createWriter() {
		return new XMLWriter();
	}
}
