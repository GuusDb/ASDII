package domein;

import java.lang.reflect.*;

public class NonOwnerInvocationHandler implements InvocationHandler {

	private PersonBean person;

	public NonOwnerInvocationHandler(PersonBean person) {
		this.person = person;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws IllegalAccessException {
		if (method.getName().startsWith("get") || method.getName().equals("setHotOrNotRating")) {
			try {
				return method.invoke(person, args);
			} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
				e.printStackTrace();
			}
		}else if(method.getName().startsWith("set")){
			throw new IllegalAccessException();
		}

		return null;

	}

}
