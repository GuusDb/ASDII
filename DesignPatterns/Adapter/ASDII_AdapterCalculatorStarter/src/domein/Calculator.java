package domein;

import calcLibrary.*;
import calcLibrary.CalculatorLibrary;

public class Calculator implements TargetLong {

	private TargetDouble calc;

	public long add() {
		return (long) calc.add();
	}

	public Calculator(long x, long y) {
		calc = new CalculatorLibrary(x, y);
	}
}
