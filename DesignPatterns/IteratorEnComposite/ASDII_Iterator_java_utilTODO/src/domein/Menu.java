package domein;

import java.util.*;

public interface Menu {

	java.util.Iterator<MenuItem> createIterator();

	java.lang.String getTitle();
}
