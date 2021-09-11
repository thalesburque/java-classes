package entities;

public class Company extends TaxPayer {

	private Integer numOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double yearIncome, Integer numOfEmployees) {
		super(name, yearIncome);
		this.numOfEmployees = numOfEmployees;
	}

	public Integer getNumOfEmployees() {
		return numOfEmployees;
	}

	public void setNumOfEmployees(Integer numOfEmployees) {
		this.numOfEmployees = numOfEmployees;
	}

	@Override
	public double tax() {
		if (numOfEmployees <= 10)
			return getYearIncome() * 0.16;
		else
			return getYearIncome() * 0.14;
	}

}
