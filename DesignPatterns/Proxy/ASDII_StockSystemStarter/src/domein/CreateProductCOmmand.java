package domein;

public class CreateProductCOmmand implements Command {

	private final StockService stockService;
	private int quantity;
	private String productName;

	public CreateProductCOmmand(StockService stockService, String productNaam, int quantity) {
		this.stockService= stockService;
		this.productName = productNaam;
		this.quantity= quantity;
	}
	
	public String execute() {
		return stockService.insert(productName, quantity);
		
	}

}
