package entities;

public class Funcionario {
	
	public String name;
	public double grossSalary;
	public double tax;
	double salary;
	
	public double netSalary() {
		salary = grossSalary - tax;
		return salary;
	}
	
	public double increaseSalary(double percentage) {
		salary = salary + grossSalary * (percentage / 100);
		return salary;
	}
	
	public String toString() {
		return name + ", $ " + salary;
	}
}
