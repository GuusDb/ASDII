package main;

import domein.BinaryPersistenceFactory;
import domein.Drawing;
import domein.Persistence;
import domein.Reader;
import domein.Writer;
import domein.XMLPersistenceFactory;

public class StartUp {
	private Persistence persistence;
	private Drawing drawing;
	private Writer writer;
	private Reader reader;
	private String filePath;

	public static void main(String[] args) {
		new StartUp().run();
	}
	private void run() {

		persistence = new Persistence(new BinaryPersistenceFactory());
		filePath = "c:/drawing.dat";
		writer = persistence.newWriter();
		writer.writeDrawing(filePath, drawing);
		reader = persistence.newReader();
		reader.readDrawing(filePath);

		persistence = new Persistence(new XMLPersistenceFactory());
		filePath="c:/drawing.xml";
		writer = persistence.newWriter();
		writer.writeDrawing(filePath, drawing);
		reader = persistence.newReader();
		reader.readDrawing(filePath);

	}
}
