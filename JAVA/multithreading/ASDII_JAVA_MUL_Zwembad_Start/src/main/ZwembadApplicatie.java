package main;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.IntStream;

import domein.Kind;
import domein.Tafel;
import domein.Vat;
import domein.Zwembad;

public class ZwembadApplicatie {
	private Vat vat;
	private Kind kind[];

	public static void main(String args[]) {
		new ZwembadApplicatie().run();
	}

	public void run() {
		Tafel tafel = new Tafel(2);
		vat = new Vat(9, tafel);
		kind = new Kind[3];
		IntStream.range(0, kind.length).forEach(i -> 
			kind[i] = new Kind(tafel, new Zwembad(4), "Kind " + (i + 1))
		);

		// VUL VERDER AAN
		// --------------
		ExecutorService pool = Executors.newFixedThreadPool(kind.length+1);
		pool.execute(vat);
		Arrays.stream(kind).forEach(kind -> pool.execute(kind));
		pool.shutdown();

	}
}
