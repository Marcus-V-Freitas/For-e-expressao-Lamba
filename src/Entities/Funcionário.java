package Entities;

public class Funcion�rio {
	private Integer Id;
	private String Name;
	private Double Salary;
	
	public Funcion�rio(Integer id, String name, Double salary) {
		super();
		Id = id;
		Name = name;
		Salary = salary;
	}
	
	public Funcion�rio() {}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Double getSalary() {
		return Salary;
	}

	public void IncreaseSalary(Double percentage) {
		Salary += Salary*percentage/100;
	}
	
	public String toString() {
		return "ID: " + Id +" "+ "Name: " +Name +" " + "Salary: R$" + String.format(" %.2f", getSalary());
	}
	
}
