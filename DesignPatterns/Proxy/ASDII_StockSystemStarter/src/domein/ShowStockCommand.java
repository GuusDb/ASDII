package domein;

public class ShowStockCommand implements Command {

	private final IStockService stockService;

	public ShowStockCommand(IStockService iStockService) {
		this.stockService=iStockService;
	}
	
	public String execute() {
		return String.format("DATABASE : stockstatus%n%s%n", stockService.productenView());
	}

}
