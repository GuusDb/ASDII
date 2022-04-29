package domein;

public class UpdateProductCommand implements Command {

	private final IStockService stockService;
	private String productName;
	private int newQuantity;
	
	public UpdateProductCommand(IStockService iStockService, String productName, int newQuantity) {
		this.stockService=iStockService;
		this.productName = productName;
		this.newQuantity = newQuantity;
	}

	public String execute() {
		 return stockService.update(productName, newQuantity);
	}

}
