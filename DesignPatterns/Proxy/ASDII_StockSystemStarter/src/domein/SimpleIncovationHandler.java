package domein;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class SimpleIncovationHandler implements InvocationHandler {

	private IStockService stockService;

	public SimpleIncovationHandler(IStockService stockService) {
		this.stockService = stockService;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws AccessDeniedException {
		if(method.getName().equals("productenView")) {
			try {
				method.invoke(stockService, args);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		throw new AccessDeniedException();
	}
}
