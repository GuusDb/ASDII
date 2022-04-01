package domein;

public class ShowStockCommand implements Command {

	private final StockService stockService;

	public ShowStockCommand(StockService stockService) {
		this.stockService=stockService;
	}
	
	public String execute() {
		return String.format("DATABASE : stockstatus%n%s%n", stockService.productenView());
	}

}
