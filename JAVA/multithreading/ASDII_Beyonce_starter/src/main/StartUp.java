package main;

import domein.Beyonce;

public class StartUp {
	
	public static void main(String args[])
	{
		Beyonce beyonce1 = Beyonce.getInstance();
		Beyonce beyonce2 = Beyonce.getInstance();
		
		beyonce1.zingEenLied();
		beyonce2.zingEenLied();
	}

}
