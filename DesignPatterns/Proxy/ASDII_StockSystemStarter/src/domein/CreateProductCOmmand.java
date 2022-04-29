package domein;

public class CreateProductCOmmand implements Command {

	private final IStockService stockService;
	private int quantity;
	private String productName;

	public CreateProductCOmmand(IStockService iStockService, String productNaam, int quantity) {
		this.stockService= iStockService;
		this.productName = productNaam;
		this.quantity= quantity;
	}
	
	public String execute() {
		return stockService.insert(productName, quantity);
		
	}

}
