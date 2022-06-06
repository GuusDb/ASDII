package domein;

public class Persistence {
	private PersistenceFactory persistenceFactory;

	public Persistence(PersistenceFactory persistenceFactory) {
		this.persistenceFactory = persistenceFactory;
	}

	public Reader newReader() {
		return persistenceFactory.createReader();
	}

	public Writer newWriter() {
		return persistenceFactory.createWriter();
	}

}
