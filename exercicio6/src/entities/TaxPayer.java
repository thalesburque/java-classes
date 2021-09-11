package entities;

public abstract class TaxPayer {

	private String name;
	private Double yearIncome;

	public TaxPayer() {

	}

	public TaxPayer(String name, Double yearIncome) {
		this.name = name;
		this.yearIncome = yearIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getYearIncome() {
		return yearIncome;
	}

	public void setYearIncome(double yearIncome) {
		this.yearIncome = yearIncome;
	}

	public abstract double tax();

}
