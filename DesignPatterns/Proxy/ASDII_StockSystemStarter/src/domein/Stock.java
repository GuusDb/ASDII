package domein;

import java.util.HashMap;
import java.util.Map;
import java.util.*;

public class Stock {

    private Map<String, Integer> map;
    
    public Stock(){
        this.map = new HashMap<>();
        map.put("potlood", 10);
        map.put("gom", 5);
        map.put("pen", 15);
    }

    public void insert(String productName, int quantity) {
        map.put(productName, quantity);
    }

    public void update(String productName, int quantity) {
        map.put(productName, quantity);
    }

    public void ship(String productName) {
    	if (map.containsKey(productName)) {
    		map.put(productName, map.get(productName) - 1);
    	}
    }

    public int getQuantity(String productName) {
        return map.get(productName);
    }

    public String productenView() {
        return map.toString();
    }
}
