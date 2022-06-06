package domein;

public class XMLWriter implements Writer {

	public void writeDrawing(String filePath, Drawing drawing) {
		System.out.println("writing drawing in XML format to " + filePath);
	}
}
