package main;

import cui.Console;
import domein.DomeinController;

public class Main {
	
	public static void main(String[] args) {
		new Main().run();	
	}

	private void run() {
		new Console(new DomeinController()).run();
	}

}
