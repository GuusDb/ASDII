package domein;

public interface PersistenceFactory {

	Reader createReader();

	Writer createWriter();
}
