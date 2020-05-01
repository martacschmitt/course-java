package entities;

public class Student {

	public String name;
	public double firstGrade;
	public double secondGrade;
	public double thirdGrade;

	public double finalGrade() {
		return firstGrade + secondGrade + thirdGrade;
	}
	
	public double missingPoints() {
		return 60.00 - finalGrade();
	}
	
	public String result() {
		if (finalGrade() >= 60.00) {
			return "PASS";
		}
		return "FAILED\nMISSING " + missingPoints() + " POINTS";
	}
	
	@Override
	public String toString() {
		return "FINAL GRADE = " + String.format("%.2f%n", finalGrade()) + result();
	}
}
