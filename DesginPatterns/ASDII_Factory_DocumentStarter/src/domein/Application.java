package domein;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

//CREATOR
//TODO
public abstract class Application {

    private final Map<String, Document> documents = new HashMap<>();

    public void addNewDocument(String name) {
        // TODO
    	documents.put(name, createDocument());
    }

    public Document getDocument(String name) {
        return documents.get(name);
    }

    public Document removeDocument(String name) {
        return documents.remove(name);
    }

	public abstract Document createDocument();
}
