package Entities;

public class Employee {
	private String Name;
	private double GrossSalary;
	private double Tax;
	
	public void SetValues(String name, double grossSalary, double tax) {
		Name=name;
		GrossSalary=grossSalary;
		Tax=tax;
	}
	
	public double NetSalary() {
		return GrossSalary-Tax;
	}
	
	public void IncreaseSalary(double percentage) {
		GrossSalary+=GrossSalary*percentage/100;
	}
	
	public String toString() {
		return Name + String.format("  %.1f", NetSalary());
	}
}
