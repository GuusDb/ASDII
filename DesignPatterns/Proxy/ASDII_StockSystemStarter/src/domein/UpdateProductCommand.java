package domein;

public class UpdateProductCommand implements Command {

	private final StockService stockService;
	private String productName;
	private int newQuantity;
	
	public UpdateProductCommand(StockService stockService, String productName, int newQuantity) {
		this.stockService=stockService;
		this.productName = productName;
		this.newQuantity = newQuantity;
	}

	public String execute() {
		 return stockService.update(productName, newQuantity);
	}

}
