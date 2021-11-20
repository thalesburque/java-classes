package model.services;

public class PaypalService implements OnlinePaymentService {
	
	private static final double MONTHLY_INTEREST = 0.01;
	private static final double PAYMENT_FEE = 0.02;
	
	@Override
	public double paymentFee(double amount) {
		return amount * PAYMENT_FEE;
	}
	
	@Override
	public double interest(double amount, int months) {
		return amount * MONTHLY_INTEREST * months;
	}
}
