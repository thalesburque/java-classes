package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double calcCurrency(double dollarPrice, double dollarQuantity) {
		return dollarPrice * dollarQuantity + dollarPrice * dollarQuantity * IOF;
	}
}
