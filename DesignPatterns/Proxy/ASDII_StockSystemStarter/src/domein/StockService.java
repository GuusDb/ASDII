package domein;

public class StockService implements IStockService{

    private Stock stock = new Stock();

    public String insert(String productName, int quantity) {
        stock.insert(productName, quantity);
        //DATABASE : code to create product in stock
        //LOG : code to log creation
        return String.format("DATABASE : product in stock created%n"+  // simulate inserting in the database 
                      "LOG: stock created for product %s and quantity %d%n",// simulate logging
            productName, quantity);               
    }

    public String update(String productName, int quantity) {
        int oldQuantity = stock.getQuantity(productName);
        stock.update(productName, quantity);
        //DATABASE : code to update quantity product in stock
        //LOG : code to log update
        return String.format("DATABASE: Updated quantity for product %s%n"+  // simulate updating a database 
                      "LOG: Updated stock quantity from %d to %d%n",// simulate logging
            productName, oldQuantity, quantity); 
    }

    public String ship(String productName) {
        stock.ship(productName); 
        //DATABASE : code to update quantity product in stock
        //LOG : code to log shipment
        return String.format("DATABASE : Product %s is now shipped%n"+  // simulate inserting in the database 
                      "LOG: Product %s has been shipped%n",// simulate logging
            productName, productName);   
    }

    public String productenView() {
        return stock.productenView();
    }
}
