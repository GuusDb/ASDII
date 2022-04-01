package domein;

public class ShipProductCommand implements Command {

	private final StockService stockService;
	private String productName;
	
	public ShipProductCommand(StockService stockService, String productNaam) {
		this.stockService = stockService;
		this.productName=productNaam;
	}

	public String execute() {
		return stockService.ship(productName);
	}

}
