package domein;

public class NoCommand implements Command {

	private StockService stockService;
	private String name;

	public NoCommand(String name) {
		this.name = name;
	}
	
	public String execute() {
		return name;
	}

}
