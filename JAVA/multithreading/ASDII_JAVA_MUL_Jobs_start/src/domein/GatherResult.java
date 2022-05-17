package domein;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GatherResult<T> {
	private PropertyChangeSupport subject = new PropertyChangeSupport(this);
	private List<T> li  = Collections.synchronizedList(new ArrayList<>());

	public void addObserver(PropertyChangeListener pcl) {
		subject.addPropertyChangeListener(pcl);	
	}
	public void addResult(T elem) {
		li.add(elem);
		subject.firePropertyChange(new PropertyChangeEvent(this, "list", null, li));
	}
}
