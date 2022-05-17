package cui;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.util.List;
import java.util.stream.IntStream;

import domein.DomeinController;

public class Console implements PropertyChangeListener {
	private List<String> li;
	private DomeinController dc;
	public Console(DomeinController domeinController) {
		dc = domeinController;
	}
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		li = (List<String>) evt.getNewValue();
		System.out.println(li);
	}
	public void run() {
		dc.addObserver(this);
		System.out.println("start calculations...");
		dc.runJobs();
		IntStream.range(1, 30).forEach( e ->{
			try {
				Thread.sleep(50);
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			System.out.println(e);
		});
		System.out.println("einde applicatie");
	}
}
