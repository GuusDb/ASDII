package domein;

import javafx.beans.value.ChangeListener;

public class DomeinController {
	
	private TellerThread tellerThread;
	
	public DomeinController() {
		tellerThread = new TellerThread();
		new Thread(tellerThread).start();	
	}
	
	public void addObserver(ChangeListener<? super Number> listener) {
		tellerThread.addObserver(listener);
	}
	
	public void resume() {
		tellerThread.resume();
	}
	
	public void suspend() {
		tellerThread.suspend();	
	}
	
	public void stop() {
		tellerThread.stop();
	}
}
