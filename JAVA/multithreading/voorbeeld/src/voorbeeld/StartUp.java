package voorbeeld;

import java.util.stream.IntStream;

public class StartUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new StartUp().run();
	}

	public void run() {
		System.out.println("hello");
		System.out.println(Thread.currentThread().getName());
		IntStream.range(1, 11).forEach( tel -> {
			new Thread(() -> {
				System.out.println("goededag");
				System.out.println(Thread.currentThread().getName());
			}).start();
		});
		
		System.out.println("bye");
	}

}
