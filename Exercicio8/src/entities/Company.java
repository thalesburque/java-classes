package entities;

public class Company extends TaxPayer{
	
	private Integer numburOfEmployees;
	
	public Company() {
		super();
	}

	public Company(String name, Double anualIncome, Integer numburOfEmployees) {
		super(name, anualIncome);
		this.numburOfEmployees = numburOfEmployees;
	}

	public Integer getNumburOfEmployees() {
		return numburOfEmployees;
	}

	public void setNumburOfEmployees(Integer numburOfEmployees) {
		this.numburOfEmployees = numburOfEmployees;
	}

	@Override
	public Double calculateTax() {
		if(numburOfEmployees > 10) {
			return getAnualIncome() * 0.14;
		}
		else {
			return getAnualIncome() * 0.16;
		}
	}

}
