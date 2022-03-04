package domein;

import java.util.ArrayList;
import java.util.List;

public class Diagram extends Graphic  {

	private List<Graphic> graphics = new ArrayList<>();

	public void add(Graphic item) {
		graphics.add(item);
	}

	public void remove(Graphic item) {
		graphics.remove(item);
	}

	public Graphic get(int index) {
		return graphics.get(index);
	}

	public void draw() {
		graphics.forEach(Graphic::draw);
	}
}
