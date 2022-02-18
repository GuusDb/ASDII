package domein;

import java.util.HashMap;
import java.util.Map;

//CREATOR
//TODO
public class Application {

    private final Map<String, Document> documents = new HashMap<>();

    public void addNewDocument(String name) {
        // TODO
    }

    public Document getDocument(String name) {
        return documents.get(name);
    }

    public Document removeDocument(String name) {
        return documents.remove(name);
    }
}
