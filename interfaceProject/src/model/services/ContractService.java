package model.services;

import java.util.Calendar;
import java.util.Date;

import model.entities.Contract;
import model.entities.Installment;

public class ContractService {

	OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}

	public void processContract(Contract contract, Integer months) {

		for (int i = 1; i <= months; i++) {

			double amount = contract.getTotalValue() / months;

			// calculate installment value
			double interest = onlinePaymentService.interest(amount, i);
			double paymentFee = onlinePaymentService.paymentFee(amount + interest);
			double installmentValue = amount + interest + paymentFee;

			// calculate payment due date
			Date dueDate = addMonths(contract.getDate(), i);

			// add an element to the installment list
			contract.addInstallment(new Installment(dueDate, installmentValue));
		}

	}
	
	// method to calculate payment due date
	private Date addMonths(Date date, int numOfMonths) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.MONTH, numOfMonths);
		return cal.getTime();
	}

}
