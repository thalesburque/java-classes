package entities;

public class Individual extends TaxPayer {

	private Double healthPayments;

	public Individual() {
		super();
	}

	public Individual(String name, Double yearIncome, Double healthPayments) {
		super(name, yearIncome);
		this.healthPayments = healthPayments;
	}

	public Double getHealthPayments() {
		return healthPayments;
	}

	public void setHealthPayments(Double healthPayments) {
		this.healthPayments = healthPayments;
	}

	@Override
	public double tax() {
		if (getYearIncome() <= 20000)
			return getYearIncome() * 0.15 - healthPayments * 0.5;
		else
			return getYearIncome() * 0.25 - healthPayments * 0.5;
	}

}
