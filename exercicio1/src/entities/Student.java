package entities;

public class Student {
	
	public String name;
	public double grade1;
	public double grade2;
	public double grade3;
	double finalGrade;
	
	public double finalGrade() {
		finalGrade = grade1 + grade2 + grade3;
		return finalGrade;
	}
	
	public String toString() {
		if(finalGrade >= 60) {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade) + "\n"
					+ "PASS \n";
		} else {
			return "FINAL GRADE = " + String.format("%.2f", finalGrade) + "\n"
					+ "FAILED \n"
					+ "MISSING " + String.format("%.2f", (60 - finalGrade)) + " POINTS \n";
		}
		
	}
}
