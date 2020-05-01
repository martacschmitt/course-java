package util;

public class CurrencyConverter {

	public static double convertToReais(double amount, double price) {
		double valueInReais = amount * price;
		return valueInReais + (valueInReais * 0.06);
	}
	
}
