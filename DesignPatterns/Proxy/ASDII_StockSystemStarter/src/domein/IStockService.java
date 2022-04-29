package domein;

public interface IStockService {

	java.lang.String insert(java.lang.String productName, int quantity);

	java.lang.String update(java.lang.String productName, int quantity);

	java.lang.String ship(java.lang.String productName);

	java.lang.String productenView();
}
