package domein;

public class CommandFactory {

	private StockService stockService;

	public CommandFactory(StockService stockService) {
		this.stockService = stockService;
	}

	public Command createCommand(String[] args) {
		try {
			return switch (args[0].toLowerCase()) {
			case "updatequantity" -> new UpdateProductCommand(stockService, args[1], Integer.parseInt(args[2]));
			case "createproduct"-> new CreateProductCOmmand(stockService, args[1], Integer.parseInt(args[2]));
			case "shipproduct" -> new ShipProductCommand(stockService, args[1]);
			case "showstock" -> new ShowStockCommand(stockService);
			default -> new NoCommand("Unrecognized action" + args[0]);
			};
		}catch(NumberFormatException | IndexOutOfBoundsException ex) {
			return new NoCommand((args.length>0? String.format("%s called with invalid arguments", args[0]):"no command arguments provided") + ex.getMessage());
		}
	}
}
