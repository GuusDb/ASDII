package domein;

public class ScreenFactory {

	public static Screen createScreen(String type) {

		return switch (type.toLowerCase()) {
		//case "win" -> //TODO
		//case "mac" -> //TODO
		default -> null;
		};
	}
	
}
