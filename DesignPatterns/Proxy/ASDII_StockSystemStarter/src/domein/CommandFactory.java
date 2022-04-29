package domein;

import java.lang.reflect.Array;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CommandFactory {

	private IStockService iStockService;

	public CommandFactory(IStockService stockService) {
		this.iStockService = stockService;
	}

	public Command createCommand(boolean isAdmin, java.lang.String[] args) {
		IStockService iStockService = getUserStockService(isAdmin);
		args = Arrays.asList(args).subList(1, args.length).toArray(args);
		try {
			return switch (args[0].toLowerCase()) {
			case "updatequantity" -> new UpdateProductCommand(iStockService, args[1], Integer.parseInt(args[2]));
			case "createproduct"-> new CreateProductCOmmand(iStockService, args[1], Integer.parseInt(args[2]));
			case "shipproduct" -> new ShipProductCommand(iStockService, args[1]);
			case "showstock" -> new ShowStockCommand(iStockService);
			default -> new NoCommand("Unrecognized action" + args[0]);
			};
		}catch(NumberFormatException | IndexOutOfBoundsException ex) {
			return new NoCommand((args.length>0? String.format("%s called with invalid arguments", args[0]):"no command arguments provided") + ex.getMessage());
		}
	}

	private IStockService getUserStockService(boolean isAdmin) {
		if(isAdmin) {
			return iStockService;
		}
		return (IStockService) Proxy.newProxyInstance(iStockService.getClass().getClassLoader(), iStockService.getClass().getInterfaces()
				, new SimpleIncovationHandler(iStockService));
	}
}
