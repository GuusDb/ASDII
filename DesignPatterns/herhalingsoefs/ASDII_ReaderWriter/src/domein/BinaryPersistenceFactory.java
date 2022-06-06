package domein;

public class BinaryPersistenceFactory implements PersistenceFactory {

	public Reader createReader() {
		return new BinaryReader();
	}

	public Writer createWriter() {
		return new BinaryWriter();
	}

}
