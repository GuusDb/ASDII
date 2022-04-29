package domein;

public class ShipProductCommand implements Command {

	private final IStockService stockService;
	private String productName;
	
	public ShipProductCommand(IStockService iStockService, String productNaam) {
		this.stockService = iStockService;
		this.productName=productNaam;
	}

	public String execute() {
		return stockService.ship(productName);
	}

}
