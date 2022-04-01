package domein;

public class StockServiceController {

    private StockService service;

    private CommandFactory commandFactory;
    
    public StockServiceController() {
    	service = new StockService();
    	commandFactory = new CommandFactory(service);
    }

	public String performActions(String[] args) {
		return commandFactory.createCommand(args).execute();
    }
}
